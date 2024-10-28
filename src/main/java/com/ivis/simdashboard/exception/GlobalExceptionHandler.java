package com.ivis.simdashboard.exception;


import com.ivis.simdashboard.dto.ErrorCode;
import com.ivis.simdashboard.dto.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleResponseStatusException(ResponseStatusException ex) {
        logger.error("Error occurred: {}", ex.getReason(), ex);

        // Create an error response with the code and message
        ErrorResponse errorResponse = new ErrorResponse(
                ErrorCode.RESOURCE_NOT_FOUND.getCode(),  // This should map to the relevant error code
                ex.getReason()                           // This provides the reason for the error
        );

        return ResponseEntity.status(ex.getStatusCode()) // Correct way to get the HTTP status
                .body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGeneralException(Exception ex) {
        logger.error("An unexpected error occurred: {}", ex.getMessage(), ex);

        // General error response
        ErrorResponse errorResponse = new ErrorResponse(
                ErrorCode.INTERNAL_SERVER_ERROR.getCode(),
                "An unexpected error occurred" // Use a generic message for general exceptions
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
