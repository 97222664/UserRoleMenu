package com.kuang.mapper;

import com.kuang.model.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RoleMapper {

    //添加角色
    int addRole(String name);

    //查询所有角色
    List<Role> queryRoleList();


}
