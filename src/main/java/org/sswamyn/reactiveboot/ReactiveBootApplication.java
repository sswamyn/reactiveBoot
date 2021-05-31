package org.sswamyn.reactiveboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.sswamyn.reactiveboot.domain.Agent;
import org.sswamyn.reactiveboot.domain.AgentRepository;
import org.sswamyn.reactiveboot.domain.AgtAddress;
import org.sswamyn.reactiveboot.domain.AgtAddressRepository;


// ******* @SpringBootApplication - is a combination of these three annotations ********
// @EnableAutoConfiguration - Enables Spring Boot automatic configuration. Spring Boot will automatically configure your project based on dependencies. For
//  example, if you have the spring-boot-starter-web dependency, Spring Boot assumes that you are developing a web
//  application and configures your application accordingly.
// @ComponentScan - Enables the Spring Boot component scan to find all components from your application.
// @Configure - Defines the class that can be used as a source of bean definitions.


@SpringBootApplication
public class ReactiveBootApplication {
    @Autowired
    private AgentRepository repo;

    @Autowired
    private AgtAddressRepository addressRepo;

    private static final Logger logger = LoggerFactory.getLogger(ReactiveBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReactiveBootApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            // networkID varchar-20; agtType varchar-20; agtStatus varchar-4; commissioinLevel int; creditLimit int
            Agent agt1 = new Agent("Network ID like NAID", "Retail Digital", "OCSP", 10, 2000);
            Agent agt2 = new Agent("ABC123456", "Retail", "O", 10, 10000);
            Agent agt3 = new Agent("PQR88448822", "Digital", "O", 20, 20000);

            repo.save(agt1);
            repo.save(agt2);
            repo.save(agt3);

            // Now let us add some addresses for these agents
            /*String addressLine1, String addressLine2, String addressLine3, String addressCity,
                      String addressProvince, String addressCountry, String addressPostalcode, Agent agent
             */
            AgtAddress agtAddress = new AgtAddress(
                    "address Line 1","address Line 2","address Line 3", "City like Denver", "province Colorado",
                    "Country USA", "zipcode", agt1);
            addressRepo.save(agtAddress);
            //Let us reuse the Object, and be kind to garbage collector :)
            agtAddress = new AgtAddress(
                    " Line 1"," Line 2"," Line 3", "Denver", " Colorado",
                    " USA", "80130", agt1);
            addressRepo.save(agtAddress);
            agtAddress = new AgtAddress(
                    " another Line 1","another  Line 2"," another Line 3", "New York", " New York",
                    " USA", "01234", agt2);
            addressRepo.save(agtAddress);
            agtAddress = new AgtAddress(
                    " another Line","another  Line"," another Line", "SFO", "CA",
                    " USA", "90124", agt2);
            addressRepo.save(agtAddress);
        };
    }
}