package com.rafiyadhotel.hotelmanagementsystem.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String test(){
        return "Working fine";
    }
}
