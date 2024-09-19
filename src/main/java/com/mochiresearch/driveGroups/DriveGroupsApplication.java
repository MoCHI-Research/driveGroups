package com.mochiresearch.driveGroups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DriveGroupsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriveGroupsApplication.class, args);
	}

	@GetMapping("test")
	public String test() {
		return "Hello World!";
	}
}
