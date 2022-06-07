package com.example.msmpidove.dto;

import com.example.msmpidove.entities.User;

public class UserDto {

    private final Long id;

    private final String name;

    private final String email;

    private final String phone;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}