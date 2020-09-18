package com.kuang.service;

import com.kuang.model.Vo.MenuVo;
import com.kuang.model.pojo.Menu;

import java.util.List;

public interface MenuService {

    //查询菜单列表
    List<Menu> queryMenuList();

    //通过菜单id查询菜单列表
    Menu queryMenuListById(int id);



    //通过用户id查询权限
    List<Menu> queryMenus(int userId);





}
