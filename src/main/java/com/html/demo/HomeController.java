package com.html.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("/ShrimpFriedRice")
    public String ShrimpPage(){
        return "ShrimpFriedRice";
    }

    @RequestMapping("/Crabby")
    public String CrabbyPage(){
        return "Crabby";
    }

    @RequestMapping("/")
    public String homePage(){
        return "ShrimpFriedRice";
    }
    @RequestMapping("/list")
    public String listPage(){
        return "list";
    }
}
