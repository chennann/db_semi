package com.chennann.mapper;

import com.chennann.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {


    List<User> selectAll();

    void addUser(@Param("username") String username, @Param("age") int age);

//    @Insert("insert into table01(username, age) values ( #{username}, 25)")
    void addUserSimgleParam(String username);
}
