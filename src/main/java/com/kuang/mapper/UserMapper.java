package com.kuang.mapper;

import com.kuang.model.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//表示这是一个mybatis的mapper类
@Repository
public interface UserMapper {

    //查询所有用户
    List<User> queryUserList();

//    User queryUserById(int id);

    //添加用户
    int addUser(String name,String password);

    //用户登录验证
    User identify(String name,String password);



}
