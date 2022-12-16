package ru.netology.springrest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class SpringRestApplication {
    @Value("${server.port}")
    private String port;

    @GetMapping
    public String hello(){
        return port;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

}
