package com.example.SpringBootwebapp.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }
}