package org.ccba.inertie.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InertieApi {
	
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(InertieApi.class);
		springApplication.run(args);
    }
    
}