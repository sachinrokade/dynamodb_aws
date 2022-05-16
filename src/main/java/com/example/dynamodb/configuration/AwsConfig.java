package com.example.dynamodb.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aws", ignoreUnknownFields = false)
public class AwsConfig {

    private String accessKey;
    private String secretKey;
    private String region;
    private String endpoint;

}
