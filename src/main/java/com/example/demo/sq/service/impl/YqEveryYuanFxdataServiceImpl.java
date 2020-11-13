package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.YqEveryYuanFxdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqEveryYuanFxdataServiceImpl implements YqEveryYuanFxdataService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Override
    public JSONObject getYqEveryYuanFxdataInfo(String school){
        JSONObject re = new JSONObject();
        List<Map<String,Object>> Result = yqFxdataCollectionMapper.getYqEveryYuanFxdataInfo(school);
        re.put("result",Result);
        return re;
    }
}
