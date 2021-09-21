package com.feng.bootweb.controller;


import com.feng.bootweb.bean.User;
import com.feng.bootweb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    UserMapper userMapper;
    @GetMapping(value = {"/","/login"})
    public String loginpage(){
        return "login";
    }


    @PostMapping(value = "/login")
    public String loginpage1(User user, HttpSession session, Model model, HttpServletRequest request){
        User user1= userMapper.selectById(user.getId());
if(user1==null){
    request.setAttribute("msg","不存在该用户");
    return "login";
}

        if(user.getName().equals(user1.getName())){
//        if(false){
            session.setAttribute("loginUser",user);
        return "redirect:/main.html";}
        else {
            System.out.println("f发你觉得风能发电");
            request.setAttribute("msg","账号密码错误111");
            //回到登录页面
            return "login";
        }

    }


    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
//
//        //最好用拦截器,过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser != null){
            return "main";
//        }else {
//            //session过期，没有登陆过
//            //回到登录页面
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
    }

}
