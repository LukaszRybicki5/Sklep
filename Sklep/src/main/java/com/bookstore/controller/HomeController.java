package com.bookstore.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/myAccount")
    public String myAccount() {
        return "myAccount";
    }


    @RequestMapping("/dupa")
    public String mydupa() {
        return "dupa";
    }

}
