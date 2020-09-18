package com.kuang.service.impl;

import com.kuang.mapper.MenuMapper;
import com.kuang.mapper.RoleMenuMapper;
import com.kuang.model.pojo.Menu;
import com.kuang.model.pojo.RoleMenu;
import com.kuang.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    RoleMenuMapper roleMenuMapper;
    @Autowired
    MenuMapper menuMapper;

    @Override
    public int addRoleMenu(int roleId, int[] menuIds) {

        List<RoleMenu> roleMenuList = new ArrayList<>();


        for (int menuId : menuIds) {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setRoleId(roleId);
            roleMenu.setMenuId(menuId);
            roleMenuList.add(roleMenu);
        }

        return roleMenuMapper.addRoleMenu(roleMenuList);
    }

    @Override
    public List<RoleMenu> findAllByRoleId(int roleId) {
        return roleMenuMapper.findAllByRoleId(roleId);
    }


    @Override
    public int updateRoleMenu(int roleId, int[] menuIds) {

        roleMenuMapper.deleteRoleMenu(roleId);
        List<RoleMenu> roleMenuList = new ArrayList<>();
        for (int menuId : menuIds) {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setRoleId(roleId);
            roleMenu.setMenuId(menuId);
            roleMenuList.add(roleMenu);
        }
        return roleMenuMapper.addRoleMenu(roleMenuList);


    }
}


