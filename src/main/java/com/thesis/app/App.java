package com.thesis.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Seppo on 30/06/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.thesis.app")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
