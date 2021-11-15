package com.example.helloworldservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    private Environment environment;

    @Autowired
    public HelloWorldController(Environment environment) {
        this.environment = environment;
    }
    @GetMapping("/")
    public ResponseEntity<String> sayHello()
    {
        return ResponseEntity.ok("hello world service is up and running on port: "+environment.getProperty("local.server.port"));
    }
}