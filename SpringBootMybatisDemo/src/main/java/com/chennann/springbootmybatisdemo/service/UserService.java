package com.chennann.springbootmybatisdemo.service;

import com.chennann.springbootmybatisdemo.pojo.User;

public interface UserService {
    User findUserByUsernameAndPassword(String username, String password);
}
