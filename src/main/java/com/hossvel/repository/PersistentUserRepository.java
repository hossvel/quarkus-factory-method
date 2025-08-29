package com.hossvel.repository;

import com.hossvel.model.User;

import java.util.List;

public class PersistentUserRepository //implements IUserRepository//
 {

    public List<User> listAllUsers() {
        return List.of(new User("Persist","bd"));
    }
}
