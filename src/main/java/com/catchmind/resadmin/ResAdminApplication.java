package com.catchmind.resadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ResAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResAdminApplication.class, args);
    }

}
