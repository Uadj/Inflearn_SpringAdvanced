package com.example.inflearn_springadvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class InflearnSpringAdvancedApplication {
    public static void main(String[] args) {
        SpringApplication.run(InflearnSpringAdvancedApplication.class, args);
    }
}
