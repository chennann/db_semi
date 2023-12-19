package com.chennann.springbootmybatisdemo.controller;


import com.chennann.springbootmybatisdemo.pojo.Result;
import com.chennann.springbootmybatisdemo.pojo.User;
import com.chennann.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<String> login (String username, String password) {

        User user = userService.findUserByUsernameAndPassword(username, password);

        System.out.println(user);
        if (user == null) {
            return Result.error("用户名或密码错误");
        }

        String token = "abcdefghijklmn";

        return Result.success(token);
    }
}
