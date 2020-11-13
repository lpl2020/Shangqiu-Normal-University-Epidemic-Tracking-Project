package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.entity.YqFxdataCollection;
import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sq.entity.YqFxhealthCollection;

import java.util.List;
import java.util.Map;


@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Autowired
    private YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Override
    public JSONObject getBaseInfo() {
        JSONObject result = new JSONObject();
        Map<String,Object> resultInfo = yqFxdataCollectionMapper.getBaseInfo();
        Map<String,Object> resultInfo2 = yqFxhealthCollectionMapper.getHealthCollection();
        resultInfo.putAll(resultInfo2);
        result.put("result", resultInfo);
        return result;
    }
}
