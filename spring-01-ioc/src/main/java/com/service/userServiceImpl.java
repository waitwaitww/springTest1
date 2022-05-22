package com.service;

import com.dao.userDao;
import com.dao.userDaoImpl;

public class userServiceImpl implements userservice{
    private userDao userDao ;



    public void getUser() {
        userDao.getUser();
    }
    public void setUserDao(userDao userDao) {
        this.userDao = userDao;
    }
}
