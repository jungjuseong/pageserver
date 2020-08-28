package com.clbe.pageserver;

import com.clbe.pageserver.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PageServerApplication {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(PageServerApplication.class, args);
	}

	@Bean
	public ApplicationRunner customerList(CustomerRepository customers) {
		return args -> {
			customers.findAll().forEach( c -> logger.info("{}", c));
		};
	}
}
