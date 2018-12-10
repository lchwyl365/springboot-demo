package com.team;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("username","liuchao");
        System.out.println("hello world");
        return "/user/list";
    }

}
