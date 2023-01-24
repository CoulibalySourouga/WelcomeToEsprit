package tn.esprit.spring.welcometoesprit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = {"tn.esprit.spring.entities"})
@Configuration
@ComponentScan(basePackages = {"tn.esprit.spring.controllers","tn.esprit.spring.services","tn.esprit.spring.configurations"})
@EnableJpaRepositories(basePackages = {"tn.esprit.spring.repositories"})
@EnableScheduling
@EnableAspectJAutoProxy
@Slf4j
public class WelcomeToEspritApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeToEspritApplication.class, args);
        log.info("Bienvenue les gars!");
    }

}
