package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.YqEntiContService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqEntiContServiceImpl implements YqEntiContService {
    @Autowired
    YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Autowired
    YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Override
    public JSONObject getYqEntiContServiceInfo(){
        JSONObject re = new JSONObject();
        List<Map<String,Object>> Result=yqFxdataCollectionMapper.getEntiCountDataInfo();
        List<Map<String,Object>> result=yqFxhealthCollectionMapper.getEntiCountDataInfo();
        re.put("Result",Result);
        re.put("result",result);
        return re;
    }
}
