package com.kuang;

import com.kuang.mapper.*;
import com.kuang.model.Vo.MenuVo;
import com.kuang.model.pojo.Menu;
import com.kuang.model.pojo.RoleMenu;
import com.kuang.service.MenuService;
import com.kuang.service.RoleMenuService;
import com.kuang.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootwebApplicationTests {


    @Autowired
    RoleService roleService;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMenuService roleMenuService;



    @Test
    public void test() {

        int test1 = roleMapper.addRole("test1");
        System.out.println(test1);

    }
    @Test
    public void test1() {


    }
    @Test
    public void test2() {


        }






}







