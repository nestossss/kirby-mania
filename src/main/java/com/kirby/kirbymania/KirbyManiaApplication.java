package com.kirby.kirbymania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class KirbyManiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KirbyManiaApplication.class, args);
	}
}
