package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.StudentService;
import com.example.demo.sq.service.YqFxdataService;
import com.example.demo.sq.service.YqImportantbodyService;
import com.example.demo.sq.service.YqjkdataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

@RestController// 返回json字符串的数据，直接可以编写RESTFul的接口
@RequestMapping("/student")
public class YqFxdataController {
    @Autowired
    private YqFxdataService yqFxdataService;
    @RequestMapping(value = "/sy_baseinfo", method = RequestMethod.GET)
    public JSONObject YqFxhealthInfo() {
        return yqFxdataService.getYqFxdataInfo();
    }
    //
    @Autowired
    private YqjkdataService yqjkdataService;
    @RequestMapping(value = "/sy_yqjkinfo", method = RequestMethod.POST)
    public JSONObject getYqjkdataInfo(){
        return yqjkdataService.getYqjkdataInfo();
    }
    @Autowired
    private YqImportantbodyService yqImportantbodyService;
    @RequestMapping(value = "/sy_zdgcryinfo", method = RequestMethod.GET)
    public JSONObject getYqImpdataInfo(){
        return yqImportantbodyService.getYqImbodyInfo();
    }
}
