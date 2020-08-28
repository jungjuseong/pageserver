package com.clbee.pageserver;

import com.clbee.pageserver.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PageServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PageServerApplication.class, args);
	}

}
