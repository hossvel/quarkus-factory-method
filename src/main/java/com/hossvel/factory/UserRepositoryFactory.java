package com.hossvel.factory;

import com.hossvel.repository.IUserRepository;
import com.hossvel.repository.InMemoryUserRepository;
import com.hossvel.repository.PersistentUserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class UserRepositoryFactory {

    @ConfigProperty(name = "repository.type")
    String repoType;

    public IUserRepository createRepository() {
        System.out.println(repoType);
        return switch (repoType.toLowerCase()) {
            case "memory" -> new InMemoryUserRepository();
            case "persist" -> new PersistentUserRepository();
            default -> throw new IllegalArgumentException("Error de repositorio desconocido");
        };

    }
}
