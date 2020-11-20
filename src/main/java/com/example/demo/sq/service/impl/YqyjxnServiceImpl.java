package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.YqyjxnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//@Service
//public class YqEntiContServiceImpl implements YqEntiContService {
//    @Autowired
//    YqFxdataCollectionMapper yqFxdataCollectionMapper;
//    @Autowired
//    YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
//    @Override
//    public JSONObject getYqEntiContServiceInfo(){
//        JSONObject re = new JSONObject();
//        List<Map<String,Object>> Result=yqFxdataCollectionMapper.getEntiCountDataInfo();
//        List<Map<String,Object>> result=yqFxhealthCollectionMapper.getEntiCountDataInfo();
//        re.put("Result",Result);
//        re.put("result",result);
//        return re;
//    }
//}
@Service
public class YqyjxnServiceImpl implements YqyjxnService {
    @Autowired
    YqFxhealthCollectionMapper yqFxhealthCollectionMapper;

    public JSONObject getYqyjxnServiceInfo(String school){
        JSONObject rc = new JSONObject();
        List<Map<String,Object>> result=yqFxhealthCollectionMapper.getYjxnDataInfo(school);
        List<Map<String,Object>> Result=yqFxhealthCollectionMapper.getYjxnsDataInfo(school);
        rc.put("result",result);
        rc.put("Result",Result);
        return rc;
    }

}
