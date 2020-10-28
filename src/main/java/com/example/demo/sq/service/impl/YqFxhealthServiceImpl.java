package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.YqFxhealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

@Service

public class YqFxhealthServiceImpl implements YqFxhealthService {
    @Autowired
    private YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Override
    public JSONObject getYqFxhealthInfo(){

        JSONObject res = new JSONObject();
        List<Map<String,Object>> mapResult  = yqFxhealthCollectionMapper.getYqFxhealthInfo();

        res.put("result",mapResult);
        return res;
    }
}
