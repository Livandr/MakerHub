package com.technobel.makerhub.config.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {
    private final JwtProvider jwtProvider;

    public JwtAuthFilter(JwtProvider jwtProvider){
        this.jwtProvider = jwtProvider;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //extraction du token
        String token = jwtProvider.extractToken(request);
        //validation du token
        if(token != null && jwtProvider.validateAccessToken(token)){
            //récupération de l'utilisateur lié au token
            //créer un Authentication
            Authentication auth = jwtProvider.createAuthentication(token);
            //placer l'authentication dans le securityContextHolder
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        filterChain.doFilter(request, response);
    }
}
