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
    public String toproposalTJ(HttpSession session){
        return "/proposal/proposalTJ";
    }

    @RequestMapping("/proposalCX")
    public String toproposalCX(HttpSession session){
        return "/proposal/proposalCX";
    }

    @RequestMapping("/proposalFY")
    public String toproposalFY(HttpSession session){
        return "/proposal/proposalFY";
    }

    @RequestMapping("/proposalPJ")
    public String toproposalPJ(HttpSession session){
        return "/proposal/proposalPJ";
    }

    @RequestMapping("/proposalStatistics")
    public String toproposalStatistics(HttpSession session){
        return "/proposal/proposalStatistics";
    }

    @RequestMapping("/uIAction_page_user_userEdit")
    public String toedit(HttpSession session){
        return "/proposal/edit";
    }

    @RequestMapping("/uIAction_page_user_userEdit1")
    public String toevaluate(HttpSession session){
        return "/proposal/evaluate";
    }
}
