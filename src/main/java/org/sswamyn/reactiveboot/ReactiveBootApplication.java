package org.sswamyn.reactiveboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sswamyn.reactiveboot.domain.Agent;
import org.sswamyn.reactiveboot.domain.AgentRepository;


// ******* @SpringBootApplication - is a combination of these three annotations ********
// @EnableAutoConfiguration - Enables Spring Boot automatic configuration. Spring Boot will automatically configure your project based on dependencies. For
//  example, if you have the spring-boot-starter-web dependency, Spring Boot assumes that you are developing a web
//  application and configures your application accordingly.
// @ComponentScan - Enables the Spring Boot component scan to find all components from your application.
// @Configure - Defines the class that can be used as a source of bean definitions.


@SpringBootApplication
public class ReactiveBootApplication {
    private static final Logger logger = LoggerFactory.getLogger(ReactiveBootApplication.class);

    @Autowired
    private AgentRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(ReactiveBootApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner runner(){
        return args -> {
            // Place your code here
           // repository.save(new Agent("open", "Retail", "10", 10, 10000));
          //  repository.save(new Agent("clos", "digital", "0", 20, 20000));
           // repository.save(new Agent("pend", "Retail", "20", 30, 40000));
           // repository.save(new Agent("open", "Retail", "30", 40, 80000));
           // repository.save(new Agent("open", "Retail", "40", 50, 160000));
        };
    }*/
}
