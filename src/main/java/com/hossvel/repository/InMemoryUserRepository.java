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

    @Override
    public Set<User> listAllUsers() {
        users.clear();
        users.add( new User("Memory1", "hossmell@example.com"));
        users.add( new User("Memory2", "hossmell@example.com"));
        users.add( new User("Memory3", "hossmell@example.com"));

        return users;
    }
}
