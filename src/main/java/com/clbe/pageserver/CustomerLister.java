package com.clbe.pageserver;

import com.clbe.pageserver.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
class CustomerLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final CustomerRepository customers;

    CustomerLister(CustomerRepository customers) {
        this.customers = customers;
    }

    @Override
    public void run(ApplicationArguments args) {
        customers.findAll().forEach( c -> logger.info("{}", c));
    }
}