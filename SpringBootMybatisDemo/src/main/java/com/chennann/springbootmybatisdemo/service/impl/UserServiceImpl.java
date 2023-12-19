package com.chennann.springbootmybatisdemo.service.impl;

import com.chennann.springbootmybatisdemo.mapper.UserMapper;
import com.chennann.springbootmybatisdemo.pojo.User;
import com.chennann.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {

        User user =  userMapper.findUserByUsernameAndPassword(username, password);

        return user;
    }
}
