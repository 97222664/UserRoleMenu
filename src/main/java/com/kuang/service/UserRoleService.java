package com.kuang.service;

public interface UserRoleService {

    /**
     * 给用户分配权限
     */
    int addUserRole(int userId,int roleId);


    /**
     * 修改用户角色
     */
    int updateUserRole(int userId,int roleId);




}
