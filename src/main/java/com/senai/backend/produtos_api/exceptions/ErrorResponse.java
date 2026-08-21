package com.senai.backend.produtos_api.exceptions;

import java.time.LocalDateTime;

public record ErrorResponse(
    int status,
    String message,
    LocalDateTime timestamp) {    
    
}