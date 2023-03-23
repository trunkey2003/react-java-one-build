package com.example.reactjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientForwardController {  
    // Vào tất cả path trừ api
    @GetMapping(value = {"/{path:[^\\.]*}", "/{path:^(?!api).*$}/**/{path:[^\\.]*}"})
    public String getIndex() {
        return "/index.html";
    }
}