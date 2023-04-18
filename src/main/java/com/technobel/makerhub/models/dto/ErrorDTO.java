package com.technobel.makerhub.models.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @Builder
public class ErrorDTO {

    private String message;
    private HttpStatus status;
    private LocalDateTime requestDate;
    private String URI;
}
