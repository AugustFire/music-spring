package com.young.music.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yzx
 * create_time 2020/5/12
 */
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser() {
        System.out.println("user service user");
        userDao.insert();
    }
}

