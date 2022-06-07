package com.example.msmpidove.services;

import com.example.msmpidove.entities.User;
import com.example.msmpidove.exceptions.UserNotFoundException;
import com.example.msmpidove.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(Long id) {
        Optional<User> userOpt = repository.findById(id);
        if (userOpt.isPresent()) {
            return userOpt.get();
        }

        throw new UserNotFoundException("User not found! Id: " + id);
    }
}