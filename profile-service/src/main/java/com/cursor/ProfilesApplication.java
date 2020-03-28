package com.cursor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cursor.feign", "com.cursor.controller"})
public class ProfilesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }
}