package com.hossvel.service;

import com.hossvel.model.User;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class SpanishGreetingService implements IGreetingService {

    public String greet(String name) {
        return "¡Hola, " + name + "!";
    }
}