package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathService {

    @GetMapping("/math/calculate")
    public String doMaths(Calculate requestInfo){
        // System.out.println(requestInfo.toString());
        // Calculate request = new Calculate();
        // System.out.println(requestInfo.getX() + requestInfo.getY());
        String answer = null;
        // System.out.println(requestInfo.getOperation());
        switch (requestInfo.getOperation()) {
            case "add":
                answer = requestInfo.doAdd();
                break;
            case "multiply":
                answer = requestInfo.doMultiply();
                break;
            case "subtract":
                answer = requestInfo.doSubtract();
                break;
            case "divide":
                answer = requestInfo.doDivide();
                break;
        }
        return answer;
    }

    @PostMapping("/math/sum")
    public String multiSum(Calculate requestInfo){
        String answer;
        answer = requestInfo.multiSum();
        return answer;
    }
}
