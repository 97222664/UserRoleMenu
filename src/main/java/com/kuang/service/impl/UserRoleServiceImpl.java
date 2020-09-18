package com.kuang.service.impl;

import com.kuang.mapper.RoleMapper;
import com.kuang.mapper.UserRoleMapper;
import com.kuang.model.pojo.Role;
import com.kuang.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    RoleMapper roleMapper;

    @Override
    public int addUserRole(int userId, int roleId) {

        List<Role> roles = roleMapper.queryRoleList();
        //从role集合中取出id集合
        List<Integer> list = roles.stream().map(Role::getId).collect(Collectors.toList());
        if (!list.contains(roleId)){
            return 0;
        }
        return userRoleMapper.addUserRole(userId,roleId);
    }

    @Override
    public int updateUserRole(int userId, int roleId) {
        return userRoleMapper.updateUserRole(userId,roleId);
    }
}
