package com.kuang.controller;

import com.kuang.model.Vo.MenuVo;
import com.kuang.model.pojo.Menu;
import com.kuang.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "菜单管理接口管理接口", tags = {"后台管理系统-菜单模块"})
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @ApiOperation(value = "所有权限列表")
    @RequestMapping(value = "/menulist",method = RequestMethod.POST)
    public List<Menu> queryMenuList(){
        return menuService.queryMenuList();
    }

    /**
     *根据用户id查询所拥有的权限列表
     * @param
     * @return
     */
//    @RequestMapping(value = "/user/menu",method = RequestMethod.POST)
//    public List<Menu> queryMenuByUserId(@RequestParam("id") int id){
//        List<Menu> menus = menuService.queryMenuByUserId(id);
//        return menus;
//    }


    @ApiOperation(value = "获取用户权限列表", response = List.class, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/queryMenus")
    public List<Menu> queryMenus(int userId){
        return menuService.queryMenus(userId);
    }





}
