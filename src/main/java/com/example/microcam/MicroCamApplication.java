package com.example.microcam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroCamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCamApplication.class, args);
	}

}
