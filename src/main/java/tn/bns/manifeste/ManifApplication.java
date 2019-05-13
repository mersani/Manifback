package tn.bns.manifeste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.services.IAccountService;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class ManifApplication{


    public static void main(String[] args) {
        SpringApplication.run(ManifApplication.class, args);

    }

    @Autowired
    private IAccountService accountService;

    @Bean
    public BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }





}


	 


			

