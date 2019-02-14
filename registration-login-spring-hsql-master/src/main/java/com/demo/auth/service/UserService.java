package com.demo.auth.service;

import java.util.List;

import com.demo.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
    public List<User> findAllUsers();
   }
