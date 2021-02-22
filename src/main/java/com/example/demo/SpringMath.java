package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpringMath {

    @GetMapping("/")
    public String math(){
        return "3.141592653589793";
    }

}
