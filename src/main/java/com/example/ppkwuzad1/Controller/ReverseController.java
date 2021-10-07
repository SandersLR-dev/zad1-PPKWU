package com.example.ppkwuzad1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReverseController {

    @GetMapping("/{reverse}")
    public String reverseString(@PathVariable String reverse){
        return "abc";
    }
}
