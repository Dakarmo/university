package com.highfive.university;

import org.springframework.stereotype.Service;

import com.highfive.university.config.ApplicationProperties;

@Service
public class HelloWorldService {
    public HelloWorldService (ApplicationProperties applicationProperties) {
        System.out.println(applicationProperties.getHello());
    }
}
