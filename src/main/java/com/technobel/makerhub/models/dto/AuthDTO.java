package com.technobel.makerhub.models.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;
@Data
@Builder
public class AuthDTO {
    private String token;
    private String refreshToken;
    private String username;
    private List<String> role;

    public static AuthDTO from(Authentication authentication, String token, String refreshToken) {

        return AuthDTO.builder()
                .username(authentication.getName())
                .role(authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList())
                .token(token)
                .refreshToken(refreshToken)
                .build();
    }
}
