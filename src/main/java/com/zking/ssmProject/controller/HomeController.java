package com.zking.ssmProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
//@RequestMapping("home")
public class HomeController {

    @RequestMapping("/home/index.shtml")
    public String toIndex(HttpSession session){
        return "index";
    }

    @RequestMapping("/proposalTJ")
    public String toPage(HttpSession session){
        return "/proposal/proposalTJ";
    }
}
