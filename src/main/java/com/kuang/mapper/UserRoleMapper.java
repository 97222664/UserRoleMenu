package com.kuang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRoleMapper {

    //给用户分配角色
    int addUserRole(int userId,int roleId);

    /**
     * 修改用户角色
     */
    int updateUserRole(int userId,int roleId);

}
