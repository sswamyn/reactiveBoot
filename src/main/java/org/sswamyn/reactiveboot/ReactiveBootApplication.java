package org.sswamyn.reactiveboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// ******* @SpringBootApplication - is a combination of these three annotations ********
// @EnableAutoConfiguration - Enables Spring Boot automatic configuration. Spring Boot will automatically configure your project based on dependencies. For
//  example, if you have the spring-boot-starter-web dependency, Spring Boot assumes that you are developing a web
//  application and configures your application accordingly.
// @ComponentScan - Enables the Spring Boot component scan to find all components from your application.
// @Configure - Defines the class that can be used as a source of bean definitions.


@SpringBootApplication
public class ReactiveBootApplication {

    private static final Logger logger = LoggerFactory.getLogger(ReactiveBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReactiveBootApplication.class, args);
    }

}
