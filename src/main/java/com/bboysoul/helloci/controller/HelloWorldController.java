package com.bboysoul.helloci.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String sayHello(HttpServletRequest request) {
        return "hello ci";
    }
}