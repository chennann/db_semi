package com.chennann.springbootmybatisdemo.pojo;

public class User {
    private Integer id;
    private String username;
    private String age;


    public User() {
    }

    public User(Integer id, String username, String age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", age = " + age + "}";
    }
}
