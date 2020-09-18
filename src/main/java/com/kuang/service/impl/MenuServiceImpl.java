package com.kuang.service.impl;

import com.kuang.mapper.MenuMapper;
import com.kuang.model.Vo.MenuVo;
import com.kuang.model.pojo.Menu;
import com.kuang.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> queryMenuList() {
        return menuMapper.queryMenuList();
    }

    @Override
    public Menu queryMenuListById(int id) {
        return menuMapper.queryMenuListById(id);
    }




    @Override
    public List<Menu> queryMenus(int userId) {

        List<Menu> menus = menuMapper.queryMenus(userId);
        List<Menu> menuTree = buildMenuTree(menus, 0);
        return menuTree;

    }

    /**
     * 构建菜单树
     * @param menuList
     * @param parentId
     * @return
     */
    private List<Menu> buildMenuTree(List<Menu> menuList, int parentId) {
        List<Menu> treeList = new ArrayList<>();
        menuList.forEach(menu -> {
            if (StringUtils.equals(parentId, menu.getParentId())) {
                menu.setChildMenu(buildMenuTree(menuList, menu.getMenuId()));
                treeList.add(menu);
            }
        });
        return treeList;
    }



}
