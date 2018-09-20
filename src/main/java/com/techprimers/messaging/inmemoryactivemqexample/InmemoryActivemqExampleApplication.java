package com.techprimers.messaging.inmemoryactivemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InmemoryActivemqExampleApplication {

	/* after app starts
	 * http://localhost:8081/rest/publish/HeyYou
	 */
	public static void main(String[] args) {
		SpringApplication.run(InmemoryActivemqExampleApplication.class, args);
	}
}
