package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class AreaWithFormData {

    @PostMapping("/math/area")
    public String getShapeData(Shape requestInfo){
        String answer = null;
        switch (requestInfo.getType()){
            case "circle":
                answer = requestInfo.circleArea();
                break;
            case "rectangle":
                answer = requestInfo.rectangleArea();
                break;
        }
        return answer;
    }
}
