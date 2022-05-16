package com.example.dynamodb;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class AwsDynamodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsDynamodbApplication.class, args);
    }
}
