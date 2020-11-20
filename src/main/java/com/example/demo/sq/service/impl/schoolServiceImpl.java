package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqCollageConfigureMapper;
import com.example.demo.sq.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class schoolServiceImpl implements schoolService {
    @Autowired
    private YqCollageConfigureMapper yqCollageConfigureMapper;
    @Override
    public JSONObject getSchoolInfo() {
        JSONObject resultJsonObject = new JSONObject();
        List<Map<String,Object>> schoolInfo=yqCollageConfigureMapper.getSchoolListInfo();
        resultJsonObject.put("result",schoolInfo);
        return resultJsonObject;

    }
}
