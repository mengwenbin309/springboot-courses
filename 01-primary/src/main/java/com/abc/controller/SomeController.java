package com.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/some")
    public String someHaler(){
        return "hello spring boot world";
    }
}
