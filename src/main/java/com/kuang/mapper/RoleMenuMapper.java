package com.kuang.mapper;

import com.kuang.model.pojo.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RoleMenuMapper {

    //给角色分配权限
    int addRoleMenu(List<RoleMenu> roleMenu);

    //通过角色id查询角色菜单
    List<RoleMenu> findAllByRoleId(int roleId);

    /**
     * 修改角色权限
     */
    int updateRoleMenu(List<RoleMenu> roleMenu);

    /**
     * 删除角色id所有权限
     */
    int deleteRoleMenu(int roleId);



}
