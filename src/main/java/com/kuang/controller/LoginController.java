package com.kuang.controller;

import com.kuang.model.pojo.User;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session){

        User user = userService.identify(name,password);

        if (user!=null){
            session.setAttribute("loginUser",user);
            return "dashboard";
        }else {
//            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }


  }

