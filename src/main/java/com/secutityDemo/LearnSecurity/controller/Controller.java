package com.secutityDemo.LearnSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String getMessage(){
        return "welcome to security";
    }
}
