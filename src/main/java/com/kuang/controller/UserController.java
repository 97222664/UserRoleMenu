package com.kuang.controller;

import com.kuang.model.pojo.User;
import com.kuang.service.UserRoleService;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserRoleService userRoleService;


    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public List<User> list(Model model){
        return userService.queryUserList();

    }


    //创建用户
    @RequestMapping(value = "/add/user",method = RequestMethod.POST)
    public int addUser(@RequestParam("name")String name , @RequestParam("password")String password){
       return userService.addUser(name,password);
//        return "redirect:/users";
    }

    //给用户分配角色
    @RequestMapping(value = "/userRole",method = RequestMethod.POST)
    public int userRole(@RequestParam("userId") int userId,@RequestParam("roleId") int roleId){

        return userRoleService.addUserRole(userId,roleId);
    }


    /**
     * 修改用户角色
     */
    @PostMapping("/updateUserRole")
    public int updateUserRole(@RequestParam("userId") int userId,@RequestParam("roleId") int roleId){
        return userRoleService.updateUserRole(userId,roleId);
    }


}


