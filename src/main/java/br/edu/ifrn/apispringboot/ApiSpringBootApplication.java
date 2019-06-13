package br.edu.ifrn.apispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSpringBootApplication.class, args);
    }

}
