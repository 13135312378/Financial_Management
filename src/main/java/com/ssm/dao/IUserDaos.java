package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

public interface IUserDaos {

    //查询所有
    public List<User> getAllUsers();
    //登入
    public  User login(User User);

}
