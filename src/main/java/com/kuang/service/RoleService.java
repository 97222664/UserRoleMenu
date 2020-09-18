package com.kuang.service;

import com.kuang.model.pojo.Role;

import java.util.List;

public interface RoleService {

    //添加角色
    int addRole(String name);

    //查询所有角色
    List<Role> queryRoleList();
}
