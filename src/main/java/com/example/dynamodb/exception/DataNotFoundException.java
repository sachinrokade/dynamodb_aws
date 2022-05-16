package com.example.dynamodb.exception;

/**
 * trigger for data not found exception
 */
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public DataNotFoundException(String msg) {
        super(msg);
    }
}
