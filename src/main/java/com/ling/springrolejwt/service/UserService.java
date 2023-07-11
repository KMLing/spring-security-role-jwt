package com.ling.springrolejwt.service;

import com.ling.springrolejwt.model.User;
import com.ling.springrolejwt.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
