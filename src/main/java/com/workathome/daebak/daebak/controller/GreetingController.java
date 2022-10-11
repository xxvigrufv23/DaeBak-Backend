package com.workathome.daebak.daebak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/*
*  GreetingController
*/
@Slf4j
@RestController
public class GreetingController {

    
    @GetMapping("/greeting")
    public String greeting() {

        log.info("[ API CALLED : /greeting ]");
        return "Hello, world";
    }
}
