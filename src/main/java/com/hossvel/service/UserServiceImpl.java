package com.hossvel.service;

import com.hossvel.model.User;
import com.hossvel.repository.InMemoryUserRepository;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class UserServiceImpl implements IUserService {


    @Inject
    InMemoryUserRepository  inMemoryUserRepository;
    @Override
    public Set<User> listAllUsers() {
        return inMemoryUserRepository.listAllUsers();
    }
}
