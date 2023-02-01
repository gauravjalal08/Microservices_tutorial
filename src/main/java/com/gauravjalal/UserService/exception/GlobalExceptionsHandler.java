package com.gauravjalal.UserService.exception;

import com.gauravjalal.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionsHandler {
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFound ex) {
        String message= ex.getMessage();
       ApiResponse response= ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);

    }
}
