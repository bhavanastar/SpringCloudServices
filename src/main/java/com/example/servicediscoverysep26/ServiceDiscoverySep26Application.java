package com.example.servicediscoverysep26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoverySep26Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoverySep26Application.class, args);
    }

}
