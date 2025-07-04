package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarySystem {
    public static final Logger log = LoggerFactory.getLogger(LibrarySystem.class);
    public static void main(String[] args) {

        SpringApplication.run(LibrarySystem.class, args);
        log.debug("Application started successfully");
    }
}