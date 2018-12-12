package com.team;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list2")
    public String list2(Model model){
        model.addAttribute("username","liuchao");
        System.out.println("hello world");
        System.out.println("你好");
        return "/user/list";
    }

}
