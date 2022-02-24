package com.bhaskar.springbootjava17.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author venkata.mantrala
 */
@Configuration
@EnableConfigurationProperties
public class Config {

    @Value("${app.env.default}")
    private String defaultEnv;

    @Bean
    @ConditionalOnProperty(prefix = "env", value = "dev", havingValue = "true")
    public Env getEnv() {
        System.out.println("Default environment is: " + defaultEnv);
        return new Env(defaultEnv);
    }
}
