package com.hossvel.repository;

import com.hossvel.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class PersistentUserRepository implements IUserRepository
 {
     private Set<User> users = Collections.newSetFromMap(Collections.synchronizedMap(new HashMap<>()));

    public Set<User> listAllUsers() {
        System.out.println("ALL");
        users.clear();
        users.add( new User("Persist4", "hossmell@example.com"));
        users.add( new User("Persist5", "hossmell@example.com"));
        users.add( new User("Persist6", "hossmell@example.com"));

        return users;
    }
}
