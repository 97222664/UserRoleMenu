package com.kuang.controller;

import com.kuang.model.pojo.Role;
import com.kuang.service.MenuService;
import com.kuang.service.RoleMenuService;
import com.kuang.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;
    @Autowired
    RoleMenuService roleMenuService;
    @Autowired
    MenuService menuService;

    //创建角色
    @RequestMapping(value = "/add/role",method = RequestMethod.POST)
    public int addRole(@RequestParam("name") String name){
        return roleService.addRole(name);

    }

    @RequestMapping(value = "/role", method = RequestMethod.POST)
    public List<Role> queryRoleList(){
        List<Role> roles = roleService.queryRoleList();
        return roles;
    }

    //给角色分配权限
    @RequestMapping(value = "/addRoleMenu", method = RequestMethod.POST)
    public int roleMenu(int roleId,  int[] menuIds){
        return roleMenuService.addRoleMenu(roleId, menuIds);

    }


    /**
     * 修改角色权限
     */
    @RequestMapping(value = "/updateRoleMenu", method = RequestMethod.POST)
    public int updateRoleMenu(int roleId,  int[] menuIds){
        return roleMenuService.updateRoleMenu(roleId, menuIds);

    }


}
