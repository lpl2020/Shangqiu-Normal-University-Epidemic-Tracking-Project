package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.YqFxdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqFxdataServiceImpl implements YqFxdataService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;

    @Override
    public JSONObject getYqFxdataInfo() {
        JSONObject res = new JSONObject();
        List<Map<String, Object>> mapResult = yqFxdataCollectionMapper.getFxdataInfo();
        res.put("result", mapResult);
        return res;
    }
}