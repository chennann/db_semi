package com.chennann.springbootmybatisdemo.mapper;


import com.chennann.springbootmybatisdemo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    //select演示
    @Select("select * from table01")
    List<User> selectAll();

    //参数演示
    @Insert("insert into table01(username, age) values ( #{username}, 25)")
    void singleParam(String name);
    @Insert("insert into table01(username, age) values ( #{username}, #{age})")
    void twoParam(String username, int age);

    //sql注入演示
    @Select("select * from user where username = ${username} and password = ${password}")
    User findUserByUsernameAndPassword(String username, String password);



}
