package com.chennann.springbootmybatisdemo;

import com.chennann.springbootmybatisdemo.mapper.InfoMapper;
import com.chennann.springbootmybatisdemo.mapper.UserMapper;
import com.chennann.springbootmybatisdemo.pojo.Info;
import com.chennann.springbootmybatisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBootMybatisDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private InfoMapper infoMapper;

    @Test
    void contextLoads() {
        List<User> users= userMapper.selectAll();

        System.out.println(users);

        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    void add () {

        infoMapper.addInfo("21120992", "10000001", 78);
    }
    @Test
    void delete () {

        int id = 6;
        infoMapper.deleteInfo(id);
    }
    @Test
    void update () {

        infoMapper.updateInfo(3, "10000001" , 78);
    }



    @Test
    void paramTest () {
//        userMapper.singleParam("qweqwe");

        userMapper.twoParam("qweqwe", 29);
    }


    @Test
    void DynamicSQLTest () {


        //where if
        Info info = new Info(null, "10000001", null);
        List<Info> Infolist = infoMapper.WhereAndIf(info);
        for (Info i : Infolist) {
            System.out.println(i);
        }

        //choose when otherwise
//        int state = 2;//1 - 100   2 - <60   other - >60
//        List<Info> Infolist = infoMapper.ChooseWhenOtherwise(state);
//        for (Info i : Infolist) {
//            System.out.println(i);
//        }

//        //foreach
//        List<Info> list = new ArrayList<>();
//        list.add(new Info("21120992", "10000008", 100));
//        list.add(new Info("21120538", "10000002", 77));
//        list.add(new Info("21120666", "10000003", 66));
//        infoMapper.ForeachTest(list);


//        //set
//        int state = 2; //1 - 1.05cj   2 - 0.95cj
//        infoMapper.SetTest(state);

    }
}
