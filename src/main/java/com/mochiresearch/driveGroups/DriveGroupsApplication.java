package com.mochiresearch.driveGroups;

import com.mochiresearch.driveGroups.driveGroup.DriveGroup;
import com.mochiresearch.driveGroups.user.User;
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

	@GetMapping("myTest")
	public String myTest() {
		return "Hello World!!!";
	}

	@GetMapping("printNewGroup")
	public String printNewGroup() {
		User Me = new User("String userId", "iizydorc@hamilton.edu");
		DriveGroup NewGroup = new DriveGroup("MyGroup", Me);
		return NewGroup.getName();
	}

}
