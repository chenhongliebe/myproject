package com.java.myproject.Controller.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author : wangyz
 * @Description :
 * @Date :  2017/6/5
 */
@Controller
public class HomeController {


    @Value("${sessionKey}")
    private String sessionKey;


    @RequestMapping("tologin")
    public String tologin(){
        return "/login";
    }



}
