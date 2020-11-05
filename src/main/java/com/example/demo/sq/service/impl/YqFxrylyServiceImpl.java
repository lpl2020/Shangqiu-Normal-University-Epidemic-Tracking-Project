package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqCollageConfigureMapper;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.YqFxrylyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqFxrylyServiceImpl implements YqFxrylyService {
    @Autowired
    private YqCollageConfigureMapper yqCollageConfigureMapper;

    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;

    @Override
    public JSONObject getYqFxrylyInfo(){
        JSONObject res = new JSONObject();
        JSONObject re = new JSONObject();
        List<Map<String,Object>> Result = yqFxdataCollectionMapper.getYqFxrylyInfo();
        List<Map<String,Object>> result = yqCollageConfigureMapper.getXyryInfo();
        res.put("school","山东英才学院");
        res.put("center",result);
        res.put("from",Result);
        re.put("result",res);
        return re;
    }
}
