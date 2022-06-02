package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;

@Controller
public class MainController {
    @RequestMapping(value = "/api")
    @ResponseBody

    public  String page(){
        return  "hello word";
    }
}
