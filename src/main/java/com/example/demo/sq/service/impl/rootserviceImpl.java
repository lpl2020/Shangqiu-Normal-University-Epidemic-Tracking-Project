package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqUrlTokenMapper;
import com.example.demo.sq.service.rootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class rootserviceImpl implements rootService {
    @Autowired
    private YqUrlTokenMapper yqUrlTokenMapper;
    @Override
    public JSONObject getloginInfo(String school,String user,String password){
        JSONObject resultJsonObject = new JSONObject();
        List<Map<String,Object>> loginInfo=yqUrlTokenMapper.getUrlToken(school,user,password);
        resultJsonObject.put("result",loginInfo);
        return resultJsonObject;
    }

}
