package com.technobel.makerhub.config.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.technobel.makerhub.models.entity.users.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Objects;

//@Component
//public class JwtProvider {
//
//    private static final String JWT_SECRET = "UTC.ZO\"7%0u7.ieT_f`nsQd)8Z',yp/7k[N;#D%zgrY\"z{Bheg04(O)\"H&~W\"Jv";
//    private static final long EXPIRES_AT = 86_400_000;
//    private static final String AUTH_HEADER = "Authorization";
//   private static final  String TOKEN_PREFIX = "Bearer";
//    private final UserDetailsService userDetailsService;
//
//    public JwtProvider(UserDetailsService userDetailsService) {
//
//        this.userDetailsService = userDetailsService;
//    }
//
//    public String generateToken(String username, String role){
//
//        return TOKEN_PREFIX + JWT.create()
//                .withExpiresAt( Instant.now().plusMillis(EXPIRES_AT))
//                .withSubject(username)
//                .withClaim("role", role)
//                .sign( Algorithm.HMAC512(JWT_SECRET));
//    }
//
//    public boolean validateToken(String token) {
//
//        try {
//            // 1, Le bon secret a été utilisé (et le meme algo)
//            // 2, pas expiré
//            DecodedJWT jwt = JWT.require( Algorithm.HMAC512(JWT_SECRET) )
//                    .acceptExpiresAt( EXPIRES_AT)
//                    .withClaimPresence("sub")
//                    .withClaimPresence("role")
//                    .build()
//                    .verify( token );
//
//            // 3, généré à partir d'un user existant
//            String username = jwt.getSubject();
//            User user = (User) userDetailsService.loadUserByUsername(username);
//            if( !user.isEnabled() )
//                return false;
//
//            // (4, Les roles ne sont plus bons) Verifier les roles n'est pas conventionnel
//            String tokenRole = jwt.getClaim("roles").asString();
//            return Objects.equals(user.getRole(),  tokenRole);
//        }
//        catch (JWTVerificationException | UsernameNotFoundException ex ){
//            return false;
//        }
//    }
//
//    public String extractToken(HttpServletRequest request) {
//
//        String authHeader = request.getHeader( AUTH_HEADER);
//
//        if(authHeader == null || !authHeader.startsWith( TOKEN_PREFIX ))
//            return null;
//
//        return authHeader.replaceFirst(TOKEN_PREFIX, "" );
//    }
//
//    public Authentication createAuthentication(String token) {
//
//        DecodedJWT jwt = JWT.decode(token);
//
//        String username = jwt.getSubject();
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//
//        return new UsernamePasswordAuthenticationToken(
//                userDetails.getUsername(),
//                null,
//                userDetails.getAuthorities()
//        );
//    }
//}
