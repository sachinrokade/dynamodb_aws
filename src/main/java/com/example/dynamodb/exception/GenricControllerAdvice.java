package com.example.dynamodb.exception;

import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GenricControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<GenricExcption> dataNotFound(WebRequest web,Exception e){

        GenricExcption exp=new GenricExcption();
        exp.setMsg(e.getMessage());
        exp.setStatusCode(HttpStatus.NOT_FOUND.toString());
        exp.setTimeStamp(LocalDateTime.now().toString());

        return new ResponseEntity<GenricExcption>(exp,HttpStatus.NOT_FOUND);

    }
}
