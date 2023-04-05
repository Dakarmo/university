package com.highfive.university.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix="application", ignoreUnknownFields=false)
@Getter
@Setter

public class ApplicationProperties {
    private String hello;

    
}
