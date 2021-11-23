package com.infra2.jenkzrepo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String HelloMsg(){
        return "Hell-o world";
    }
}
