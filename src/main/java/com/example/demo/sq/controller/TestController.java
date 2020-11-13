package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.TestService;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/getTestdata")
    public JSONObject getData(){

        return testService.getBaseInfo();
    }
}

