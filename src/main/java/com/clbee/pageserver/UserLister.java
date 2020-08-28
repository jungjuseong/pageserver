package com.clbee.pageserver;

import com.clbee.pageserver.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
class ProductLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ProductRepository products;

    ProductLister(ProductRepository products) {
        this.products = products;
    }

    @Override
    public void run(ApplicationArguments args) {
        products.findAll().forEach( product -> logger.info("{}", product));
    }
}