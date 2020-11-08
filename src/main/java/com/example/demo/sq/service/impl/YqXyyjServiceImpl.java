package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.YqXyyjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqXyyjServiceImpl implements YqXyyjService {
    @Autowired
    private YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Override
    public JSONObject getYqxyyjInfo(String school){
        JSONObject re = new JSONObject();
        List<Map<String,Object>> Reresult = yqWxgjCollectionMapper.getXyYjInfo(school);
        re.put("result",Reresult);
        return re;
    }
}
