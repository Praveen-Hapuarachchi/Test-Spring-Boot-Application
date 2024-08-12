package com.ruhuna.Test.Spring.Boot.Application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
