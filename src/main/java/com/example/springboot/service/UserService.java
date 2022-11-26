package com.example.springboot.service;


import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Integer id);

    void update(Integer id, User updateUser);
    void delete(Integer id);
}
