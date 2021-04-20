package com.lyzd.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaClient
public class OrderConsumerMain001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain001.class, args);
    }
}
