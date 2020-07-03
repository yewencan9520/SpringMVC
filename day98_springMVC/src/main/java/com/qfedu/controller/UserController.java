package com.qfedu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("login")
    public ModelAndView login(){
        System.out.println("hahahah");
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
    //接收字符串资源
    @RequestMapping("login2")
    public String login2(){
        System.out.println("hahahah");
        return "index.jsp";
    }

    @RequestMapping("login3")
    public String login3(String username){
        System.out.println(username);
        return "index.jsp";
    }
    //接收对象资源
    @RequestMapping("login4")
    public String login4(User user){
        System.out.println(user);
        return "index.jsp";
    }
    //Json接收资源
    @RequestMapping("login5")
    public String login5(@RequestBody User user){
        System.out.println(user);
        return "index.jsp";
    }
    //Json发送资源
    @RequestMapping("login6")
    @ResponseBody
    public User login6(){
        User user=new User();
        user.setId(3);
        user.setUsername("zhangsan");
        user.setPassword("1234");
        return user;
    }


}
