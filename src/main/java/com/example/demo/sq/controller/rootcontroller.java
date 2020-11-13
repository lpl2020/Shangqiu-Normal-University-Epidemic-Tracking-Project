package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.sq.service.rootService;
import com.example.demo.sq.service.rootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/root")
public class rootcontroller {
    @Autowired
    private rootService rootService;

    @RequestMapping(value = "/getloginInfo", method = RequestMethod.GET)

    public JSONObject login(
            @RequestParam(value = "school", required = false) String school,
            @RequestParam(value = "user", required = false) String user,
            @RequestParam(value = "password", required = false) String password) {

       return  rootService.getloginInfo(school,user,password);

    }
}