package com.hossvel.service;

import com.hossvel.model.User;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EnglishGreetingService implements IGreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}