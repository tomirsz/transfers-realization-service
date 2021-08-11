package com.transfersrealizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;

@EnableDiscoveryClient
@EnableKafka
@SpringBootApplication
public class TransfersRealizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfersRealizationServiceApplication.class, args);
    }

}
