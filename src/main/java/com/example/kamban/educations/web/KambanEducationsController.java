package com.example.kamban.educations.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KambanEducationsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/kambaneducations")
    public String contactKambanEducations() {
        return "Welcome To Kamban Educations";
    }
}
