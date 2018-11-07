package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);

    public int deleteUserById(String id);

    public int updateUser(User user);

    User findUserById(String id);

    List<User> findAllUsers();
}
