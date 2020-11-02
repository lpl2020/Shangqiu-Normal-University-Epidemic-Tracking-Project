package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.YqImportantbodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqImpbodyServiceImpl implements YqImportantbodyService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Override
    public JSONObject getYqImbodyInfo(){
        JSONObject res = new JSONObject();
        List<Map<String,Object>> mapResult  = yqFxdataCollectionMapper.getYqIbodyInfo();
        System.out.println(mapResult);
        res.put("mapResult",mapResult);
        return res;
    }
}
