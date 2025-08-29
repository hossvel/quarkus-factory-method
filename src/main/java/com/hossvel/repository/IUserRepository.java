package com.hossvel.repository;

import com.hossvel.model.User;

import java.util.List;
import java.util.Set;

public interface IUserRepository {
    public Set<User> listAllUsers();
}
