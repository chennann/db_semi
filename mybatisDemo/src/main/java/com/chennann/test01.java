package com.chennann;

import com.chennann.mapper.userMapper;
import com.chennann.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test01 {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        userMapper userMapper = sqlSession.getMapper(userMapper.class);
        List<User> users = userMapper.selectAll();

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
