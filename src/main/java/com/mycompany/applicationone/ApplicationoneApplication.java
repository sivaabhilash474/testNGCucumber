package com.mycompany.applicationone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.mycompany.applicationone")
@EnableJpaRepositories(basePackages = "com.mycompany.applicationone.repository")
@EntityScan(basePackages = "com.mycompany.applicationone.entity")
public class ApplicationoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationoneApplication.class, args);
	}

}
