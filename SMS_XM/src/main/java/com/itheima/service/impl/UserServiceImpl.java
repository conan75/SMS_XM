package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        String id = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        user.setId(id);
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(String id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
