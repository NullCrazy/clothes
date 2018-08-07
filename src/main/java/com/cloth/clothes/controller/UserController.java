package com.cloth.clothes.controller;

import com.cloth.clothes.bean.User;
import com.cloth.clothes.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao mUserDao;

    @GetMapping("/getUser")
    @ResponseBody
    public List<User> getUserDao() {
        return mUserDao.selectUser();
    }
}
