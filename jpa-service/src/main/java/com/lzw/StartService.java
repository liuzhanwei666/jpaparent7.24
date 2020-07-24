package com.lzw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartService {
    public static void main(String[] args) {
        SpringApplication.run(StartService.class);
    }
}
