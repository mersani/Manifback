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
public class ManifApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(ManifApplication.class, args);

    }

    @Autowired
    private IAccountService accountService;

    @Bean
    public BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public void run(String... args) throws Exception {
        accountService.saveUser(new AppUser("admin", "1235", "admin@gmail.com", "012345678", "aa", "aa", "aa"));
        accountService.saveUser(new AppUser("maher", "1235", "maher@gmail.com", "012345678", "aa", "aa", "aa"));
        accountService.saveUser(new AppUser("user", "user", "user@gmail.com", "102345678", "ab", "ab", "ab"));
        accountService.saveRole(new AppRole( "ADMIN"));
        accountService.saveRole(new AppRole("USER"));
        accountService.saveRole(new AppRole("CONCILIATEUR"));
        accountService.addRoleToUser("admin", "ADMIN");
        accountService.addRoleToUser("user", "USER");
        accountService.addRoleToUser("maher", "CONCILIATEUR");
    };


}


	 


			

