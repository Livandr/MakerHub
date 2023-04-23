package com.technobel.makerhub.config.security;

import com.technobel.makerhub.models.entity.users.Admin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthFilter jwtAuthFilter) throws Exception {
        http.csrf().disable();
        http.httpBasic().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        http.authorizeHttpRequests(
                registry -> registry

                        .requestMatchers(HttpMethod.POST, "/auth/login").anonymous()

                        .requestMatchers(HttpMethod.GET, "/customer/**").permitAll()
                        .requestMatchers(HttpMethod.POST,"/customer/**").permitAll()
                        .requestMatchers(HttpMethod.DELETE,"/customer/**").permitAll()

                        .requestMatchers(HttpMethod.GET, "/supplier/**").authenticated()
                        .requestMatchers(HttpMethod.POST, "/supplier/**").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/supplier/**").authenticated()

                        .requestMatchers(HttpMethod.GET, "/account/**").authenticated()
                        .requestMatchers(HttpMethod.POST, "/account/**").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/account/**").authenticated()
//
//                        .requestMatchers("/swagger").permtAll()
//                        .requestMatchers("/swagger-ui/**").permitAll()
//                        .requestMatchers("/v3/api-docs/**").permitAll()
                        .anyRequest().permitAll()
        );
        return http.build();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception{
        return configuration.getAuthenticationManager();
    }
}
