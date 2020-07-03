package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("login")
    public String login(@RequestBody User user){
        System.out.println(user);
        return "login.jsp";
    }
    @RequestMapping("login2")
    @ResponseBody
    public User login2(){
        User user=new User();
        user.setId(11);
        user.setUsername("zhangsan");
        user.setPassword("0000");
        return user;
    }

    @RequestMapping("login1")
    public String login1(){
        System.out.println("1111111");
        return "index.jsp";
    }




}
