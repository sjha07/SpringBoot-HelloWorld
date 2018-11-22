package com.satishjha.project.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!!!";
    }

    @RequestMapping("/greet")
    public String greet() {
        return "Greetings, good morning!!!";
    }

}
