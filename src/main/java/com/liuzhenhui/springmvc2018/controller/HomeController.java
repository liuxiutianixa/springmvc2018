package com.liuzhenhui.springmvc2018.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by H009558 on 2018/1/30.
 */
@Controller
@RequestMapping(path="/home")
public class HomeController {
   @RequestMapping(path = "index")
    public String Index(Model model){
       model.addAttribute("message","Hello Spring MVC!");
       return "home/index";
   }
}
