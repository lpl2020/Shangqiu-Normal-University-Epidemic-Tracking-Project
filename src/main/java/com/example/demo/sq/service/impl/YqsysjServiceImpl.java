package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.YqsysjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqsysjServiceImpl implements YqsysjService {
    @Autowired
    YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Override
    public JSONObject getYqsysjInfo(){
        JSONObject rd = new JSONObject();
        List<Map<String,Object>> Result=yqFxhealthCollectionMapper.getSysjDataInfo();
        rd.put("Result",Result);
        return rd;

    }

}
