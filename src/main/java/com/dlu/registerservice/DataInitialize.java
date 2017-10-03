package com.dlu.registerservice;

import com.dlu.registerservice.repo.User;
import com.dlu.registerservice.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;


@Component
public class DataInitialize implements CommandLineRunner {

    private final UserRepo userRepo;

    public DataInitialize(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Stream.of("Dlu", "Luke", "Andrew", "Anil", "Amar").forEach(name -> userRepo.save(new User(name)));

        userRepo.findAll().forEach(System.out::println);

    }
}
