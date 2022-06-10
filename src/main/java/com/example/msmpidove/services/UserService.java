package com.example.msmpidove.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.msmpidove.dto.user.UserDto;
import com.example.msmpidove.entities.User;
import com.example.msmpidove.exceptions.UserNotFoundException;
import com.example.msmpidove.repositories.UserRepository;

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

    public List<User> findAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public User save(UserDto dto) {
        return repository.save(convertDtoToEntity(dto));
    }

    private User convertDtoToEntity(UserDto dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        return user;
    }
}
