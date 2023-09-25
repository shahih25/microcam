package com.example.microcam.controller;

import com.example.microcam.model.MicroCam;
import com.example.microcam.service.MicroCamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MicroCamController {

    @Autowired
    MicroCamService service;

    @GetMapping("/hello")
    public String getMicroCam(@RequestParam final String myName) {
        log.info("Received name {}", myName);
        service.saveMicroCam();
        return String.format("Hello %s", myName);
    }

    @PostMapping("/save")
    public void saveMicroCam(@RequestBody final MicroCam microCam) {
        log.info("Saving in db");
    }
}
