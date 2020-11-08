package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.YqEntiContService;
import com.example.demo.sq.service.YqglCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class EpideSituDisplayPersonController {
//    接口一
    @Autowired
    YqEntiContService yqEntiContService;
    @RequestMapping(value = "/entiCount", method = RequestMethod.GET)
    public JSONObject StudentInfo(){
        return yqEntiContService.getYqEntiContServiceInfo();
    }
//    接口二
    @Autowired
    YqglCountService yqglCountService;
    @RequestMapping(value = "/glCount", method = RequestMethod.POST)
    public JSONObject getGlCountInfo(
            @RequestParam(value = "isStudent", required = true) String isStudent,
            @RequestParam(value = "personNo", required = true) String personNo
    ){
        return yqglCountService.getGlCountInfo(isStudent,personNo);
    }
}
