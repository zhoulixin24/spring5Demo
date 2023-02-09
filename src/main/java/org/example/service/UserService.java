package org.example.service;

import org.example.dao.UserDao;

public class UserService {
    //注入属性 创建UserDao属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void print(){
        System.out.println("userService");
        userDao.update();
    }
}
