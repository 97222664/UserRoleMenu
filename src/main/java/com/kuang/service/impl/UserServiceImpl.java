package com.kuang.service.impl;

import com.kuang.mapper.UserMapper;
import com.kuang.model.pojo.User;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User identify(String name, String password) {

        return userMapper.identify(name,password);
    }

    /**
     *  新增用户
     * @param name 姓名
     * @param password 密码
     * @return
     */
    @Override
    public int addUser(String name, String password) {

        //校验参数
        if(name == null){
            name="defaultName";
        }

        //代码处理参数

        //数据入库
        int id = userMapper.addUser(name,password);

        //结果返回
        if (id > 0 ){
            //成功返回
           return id;
        }else{
            //失败返回
            return 0;
        }
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
