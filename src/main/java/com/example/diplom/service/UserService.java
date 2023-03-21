package com.example.diplom.service;

import com.example.diplom.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    void deleteUser(String id);

    String getCurrentUsername();

    String getRole(User user);
}
