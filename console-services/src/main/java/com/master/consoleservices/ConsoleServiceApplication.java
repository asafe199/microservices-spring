package com.master.consoleservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsoleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsoleServiceApplication.class);
    }
}
