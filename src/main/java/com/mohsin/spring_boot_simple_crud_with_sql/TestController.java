package com.mohsin.spring_boot_simple_crud_with_sql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/")
    public String home(){
        return "home page";
    }

    @RequestMapping("/health")
    public String firstHandler(){
        return "Server Health is good";
    }
}
