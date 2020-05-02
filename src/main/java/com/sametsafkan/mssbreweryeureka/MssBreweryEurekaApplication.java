package com.sametsafkan.mssbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MssBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MssBreweryEurekaApplication.class, args);
    }

}
