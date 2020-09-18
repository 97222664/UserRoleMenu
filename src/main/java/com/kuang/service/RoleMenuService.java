package com.kuang.service;

import com.kuang.model.pojo.RoleMenu;

import java.util.List;

public interface RoleMenuService {

    //给角色分配权限
    int addRoleMenu(int roleId, int[] menuIds);

    //通过角色id查询角色菜单
    List<RoleMenu> findAllByRoleId(int roleId);

    /**
     * 修改角色权限
     */
    int updateRoleMenu(int roleId, int[] menuIds);


}
