package com.clbee.pageserver;

import com.clbee.pageserver.repository.CustomerRepository;
import com.clbee.pageserver.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
class UserLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final UserRepository users;

    UserLister(UserRepository users) {
        this.users = users;
    }

    @Override
    public void run(ApplicationArguments args) {
        users.findAll().forEach( c -> logger.info("{}", c));
    }
}