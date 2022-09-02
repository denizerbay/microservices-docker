package com.denizerbay.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "com.denizerbay.customer",
                "com.denizerbay.amqp"
        }
)
@EnableFeignClients(
        basePackages = "com.denizerbay.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
