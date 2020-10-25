package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.controller.RootMapper;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.rootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class rootserviceImpl implements rootService {
    @Autowired
    private YqFxdataCollectionMapper RootMapper;
    @Override
    public JSONObject  getloginInfo(){
        JSONObject resultJsonObject = new JSONObject();
        List<Map<String,Object>> schoolInfo=RootMapper.getschoolInfo();
        resultJsonObject.put("result",schoolInfo);
        return resultJsonObject;
    }

}
