package com.feng.bootweb.controller;

import com.feng.bootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan", 123456),
//                new User("lisi", 123444),
//                new User("haha", 21),
//                new User("hehe ", 3));
//        model.addAttribute("users",users);

        return "table/dynamic_table";
    }

}
