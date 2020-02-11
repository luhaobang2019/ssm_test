package com.bang.service;

import com.bang.entity.User;

import java.util.List;

public interface IUserService {

    Integer addUser(User user);

    List<User> getUserById(User user);
}
