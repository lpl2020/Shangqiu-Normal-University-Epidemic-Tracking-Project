package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.*;
import com.fasterxml.jackson.annotation.JsonAlias;
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
    //接口三
    @Autowired
    YqxmcrCountService yqxmcrCountService;
    @RequestMapping(value = "/xmcrCount", method = RequestMethod.GET)
    public JSONObject getxmcrCountInfo(){
        return yqxmcrCountService.getYqXmcrCountInfo();
    }
    //接口四
    @Autowired
    YqyjxnService yqyjxnService;
    @RequestMapping(value = "/yjxn",method = RequestMethod.GET)
    public JSONObject getYjxnInfo(){
        return yqyjxnService.getYqyjxnServiceInfo();
    }
    //接口五
    @Autowired
    YqsysjService yqsysjService;
    @RequestMapping(value ="/sysj",method = RequestMethod.GET)
    public JSONObject getsysjInfo(){
        return yqsysjService.getYqsysjInfo();
    }
    //接口六
    @Autowired
    YqsyrelationService yqsyrelationService;
    @RequestMapping(value = "/syrelationship",method = RequestMethod.GET)
    public JSONObject getsyrelationInfo(){
        return yqsyrelationService.getSyrelationInfo();
    }
    //接口七
    @Autowired
    YqpersionService yqpersionService;
    @RequestMapping(value = "/persionInfo",method = RequestMethod.GET)
    public JSONObject getpersionInfo(){
        return yqpersionService.getPersoionInfo();
    }
    //接口八
    @Autowired
    YqsygrgitService yqsygrgitService;
    @RequestMapping(value = "/sy_grgit",method = RequestMethod.GET)
    public JSONObject getsygrgitInfo(){
        return yqsygrgitService.getSygrgitInfo();
    }
    //接口九
    @Autowired
    YqsygrxysjService yqsygrxysjService;
    @RequestMapping(value = "sygrxysj",method =RequestMethod.GET)
    public JSONObject getsygrxysjInfo(){
        return yqsygrxysjService.getYqsygrxysjInfo();
    }








    
}
