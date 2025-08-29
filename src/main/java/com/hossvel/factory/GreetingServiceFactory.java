package com.hossvel.factory;

import com.hossvel.service.EnglishGreetingService;
import com.hossvel.service.IGreetingService;
import com.hossvel.service.SpanishGreetingService;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingServiceFactory {

    @ConfigProperty(name = "greeting.language")
    String language;

    public IGreetingService createService() {

        return switch (language.toLowerCase()) {
            case "english" -> new EnglishGreetingService();
            case "spanish" -> new SpanishGreetingService();
            default -> throw new IllegalArgumentException("Idioma no soportado: " + language);
        };
    }
}
