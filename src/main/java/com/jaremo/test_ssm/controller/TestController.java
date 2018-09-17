package com.jaremo.test_ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String case1(){
       return "index.jsp";
    }
}
