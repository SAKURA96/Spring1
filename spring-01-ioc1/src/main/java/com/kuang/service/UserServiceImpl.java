package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入
    //UserServiceImpl就不用每次都改了
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
