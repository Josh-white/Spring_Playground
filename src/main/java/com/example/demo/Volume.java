package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Volume {
    @RequestMapping("/math/volume/{length}/{width}/{height}")
    public String volume(@PathVariable String length, @PathVariable String width, @PathVariable String height){
        return String.format("The volume of a %sx%sx%s rectangle is %s", length, width, height, (Integer.parseInt(length) * Integer.parseInt(width) * Integer.parseInt(height)));
    }
}
