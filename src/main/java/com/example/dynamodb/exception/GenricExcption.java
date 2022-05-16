package com.example.dynamodb.exception;

import lombok.Data;

@Data
public class GenricExcption {

    String statusCode;
    String msg;
    String timeStamp;
}
