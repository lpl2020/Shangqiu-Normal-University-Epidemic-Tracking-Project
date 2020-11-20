package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqStudentInfoMapper;
import com.example.demo.sq.service.YqsyrelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqsyrelationServiceImpl implements YqsyrelationService {
    @Autowired
    YqStudentInfoMapper yqStudentInfoMapper;
    @Override
    public JSONObject getSyrelationInfo(String school,String userNo){
        JSONObject rf = new JSONObject();
        List<Map<String,Object>> Result=yqStudentInfoMapper.getsyrelationDataInfo(school,userNo);
        List<Map<String,Object>> result=yqStudentInfoMapper.getsyrelation2DataInfo();
        rf.put("Result",Result);
        rf.put("result",result);
        return rf;

    }
}
