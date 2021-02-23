package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DoMaths {

    @GetMapping("/math/calculate")
    public String doMaths(Calculate requestInfo){
        // System.out.println(requestInfo.toString());
        // Calculate request = new Calculate();
        // System.out.println(requestInfo.getX() + requestInfo.getY());
        String answer = null;
        // System.out.println(requestInfo.getOperation());
        if(requestInfo.getOperation().equals("add")){
            answer = requestInfo.doAdd();
        } else if (requestInfo.getOperation().equals("multiply")){
            answer = requestInfo.doMultiply();
        } else if (requestInfo.getOperation().equals("subtract")){
            answer = requestInfo.doSubtract();
        } else if (requestInfo.getOperation().equals("divide")){
            answer = requestInfo.doDivide();
        }
        return answer;
    }
}
