package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.*;
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
    public JSONObject StudentInfo(
            @RequestParam(value = "school", required = true) String school){
        return yqEntiContService.getYqEntiContServiceInfo(school);
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
    public JSONObject getxmcrCountInfo(
            @RequestParam(value = "school", required = true) String school
    ){
        return yqxmcrCountService.getYqXmcrCountInfo(school);
    }
    //接口四
    @Autowired
    YqyjxnService yqyjxnService;
    @RequestMapping(value = "/yjxn",method = RequestMethod.GET)
    public JSONObject getYjxnInfo(
            @RequestParam(value = "school", required = true) String school
    ){
        return yqyjxnService.getYqyjxnServiceInfo(school);
    }
    //接口五
    @Autowired
    YqsysjService yqsysjService;
    @RequestMapping(value ="/sysj",method = RequestMethod.GET)
    public JSONObject getsysjInfo(
            @RequestParam(value = "school", required = true) String school
    ){
        return yqsysjService.getYqsysjInfo(school);
    }
    //接口六
    @Autowired
    YqsyrelationService yqsyrelationService;
    @RequestMapping(value = "/syrelationship",method = RequestMethod.GET)
    public JSONObject getsyrelationInfo(
            @RequestParam(value = "school", required = true) String school,
            @RequestParam(value = "userNo", required = true) String userNo
    ){
        return yqsyrelationService.getSyrelationInfo(school,userNo);
    }
    //接口七
    @Autowired
    YqpersionService yqpersionService;
    @RequestMapping(value = "/persionInfo",method = RequestMethod.GET)
    public JSONObject getpersionInfo(
            @RequestParam(value = "school", required = true) String school,
            @RequestParam(value = "userNo", required = true) String userNo
    ){
        return yqpersionService.getPersoionInfo(school,userNo);
    }
    //接口八
    @Autowired
    YqsygrgitService yqsygrgitService;
    @RequestMapping(value = "/sygrgit",method = RequestMethod.GET)
    public JSONObject getsygrgitInfo(
            @RequestParam(value = "school", required = true) String school,
            @RequestParam(value = "personNo", required = true) String personNo
    ){
        return yqsygrgitService.getSygrgitInfo(school,personNo);
    }
    //接口九
    @Autowired
    YqsygrxysjService yqsygrxysjService;
    @RequestMapping(value = "sygrxysj",method =RequestMethod.GET)
    public JSONObject getsygrxysjInfo(
            @RequestParam(value = "school", required = true) String school,
            @RequestParam(value = "personNo", required = true) String personNo
    ){
        return yqsygrxysjService.getYqsygrxysjInfo(school,personNo);
    }








    
}
