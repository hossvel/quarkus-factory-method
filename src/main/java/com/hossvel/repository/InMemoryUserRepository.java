package com.hossvel.repository;

import com.hossvel.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class InMemoryUserRepository implements IUserRepository {

    private Set<User> users = Collections.newSetFromMap(Collections.synchronizedMap(new HashMap<>()));


    @PostConstruct
    void init(){

        users.add( new User("Hossmell1", "hossmell@example.com"));
        users.add( new User("Hossmell2", "hossmell@example.com"));
        users.add( new User("Hossmell3", "hossmell@example.com"));

    }

    @Override
    public Set<User> listAllUsers() {
        return users;
    }
}
