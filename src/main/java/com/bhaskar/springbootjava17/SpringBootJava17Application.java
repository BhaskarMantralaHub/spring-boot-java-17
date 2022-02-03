package com.bhaskar.springbootjava17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJava17Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJava17Application.class, args);
    }

    @PostConstruct
    void setJavaVersion() {
        System.setProperty("java.runtime.version", "17");
    }

}
