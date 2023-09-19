package com.example.microcam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MicroCamController {

    @GetMapping("/hello")
    public String getDemo(@RequestParam final String myName) {
        log.info("Received name {}", myName);
        return String.format("Hello %s", myName);
    }
}
