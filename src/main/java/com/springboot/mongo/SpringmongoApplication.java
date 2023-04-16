package com.springboot.mongo;

import com.springboot.mongo.user.User;
import com.springboot.mongo.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}


     @Bean
    public CommandLineRunner commandLineRunner(
            UserRepository repository

    ) {
        return args -> {
            var user = User.builder()
                    .name("Arun")
                    .details("student")
                    .build();
            repository.insert(user);

        };
    }
}

