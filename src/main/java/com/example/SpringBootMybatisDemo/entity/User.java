package com.example.SpringBootMybatisDemo.entity;

/**
 * 创建人：thj
 * 创建时间： 2018/6/25 11:29
 * 用途：
 */
public class User {

    private Integer id;
    private String name;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
