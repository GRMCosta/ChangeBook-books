package com.projeto.changebookbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ChangebookBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChangebookBooksApplication.class, args);
    }

}
