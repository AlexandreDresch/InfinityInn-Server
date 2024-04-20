package com.alexandredresch.infinityinn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class InfinityInnApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfinityInnApplication.class, args);
	}

}
