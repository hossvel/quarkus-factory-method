package com.hossvel.service;

import com.hossvel.factory.UserRepositoryFactory;
import com.hossvel.model.User;
import com.hossvel.repository.IUserRepository;
import com.hossvel.repository.InMemoryUserRepository;
import com.hossvel.repository.PersistentUserRepository;
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
    private final IUserRepository iUserRepository;


    public UserServiceImpl(UserRepositoryFactory userRepositoryFactory) {
        this.iUserRepository = userRepositoryFactory.createRepository();
    }

    @Override
    public Set<User> listAllUsers() {
        return iUserRepository.listAllUsers();
    }
}
