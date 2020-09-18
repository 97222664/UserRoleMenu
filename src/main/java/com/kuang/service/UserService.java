package com.kuang.service;

import com.kuang.model.pojo.User;

import java.util.List;

public interface UserService {

    User identify(String name, String password);

    int addUser(String name,String password);

    List<User> queryUserList();
}
