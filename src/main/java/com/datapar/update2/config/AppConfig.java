package com.datapar.update2.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by george.bonespirito on 17/02/2017.
 */
@SpringBootApplication
@EntityScan("com.datapar.update2.domain")
@EnableJpaRepositories("com.datapar.update2.repository")
@ComponentScan({"com.datapar.update2.service", "com.datapar.update2.controller"})
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
