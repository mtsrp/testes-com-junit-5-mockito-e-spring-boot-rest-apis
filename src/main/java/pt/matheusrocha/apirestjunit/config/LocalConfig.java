package pt.matheusrocha.apirestjunit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pt.matheusrocha.apirestjunit.domain.User;
import pt.matheusrocha.apirestjunit.repositories.UserRepository;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Matheus", "matheus@hotmail.com", "123");
        User u2 = new User(null, "Luis", "luis@hotmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
