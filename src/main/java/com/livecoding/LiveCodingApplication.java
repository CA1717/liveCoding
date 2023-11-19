package com.livecoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiveCodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveCodingApplication.class, args);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&\n"
				         + "Benvenuti in academy\n"
				         + "&&&&&&&&&&&&&&&&&&&&");
	}

}
