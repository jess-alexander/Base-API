package com.services.dvdRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// conviences annotation that adds @Configuration, @EnableAutoConfiguration, and @ComponentScan
@SpringBootApplication
public class DvdRentalApplication {

	public static void main(String[] args) {
		// start the web server, handling all the xml configuration for us (phew!)
		SpringApplication.run(DvdRentalApplication.class, args);
	}

}
