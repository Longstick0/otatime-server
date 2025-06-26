package com.otatime_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OtatimeServerApplication {

	public static void main(String[] args) {
		System.out.println("오타타임 시작");
		SpringApplication.run(OtatimeServerApplication.class, args);
	}

}
