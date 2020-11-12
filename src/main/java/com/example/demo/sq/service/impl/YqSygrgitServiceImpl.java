package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqCollageConfigureMapper;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.YqsygrgitService;
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
public class YqSygrgitServiceImpl implements YqsygrgitService {
    @Autowired
    YqCollageConfigureMapper yqCollageConfigureMapper;
    @Autowired
    YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Override
    public JSONObject getSygrgitInfo(){
        JSONObject rk = new JSONObject();
        List<Map<String,Object>> Result=yqCollageConfigureMapper.getSygrgitDataInfo();
        List<Map<String,Object>> result=yqWxgjCollectionMapper.getSygrgitDataInfo();
        rk.put("Result",Result);
        rk.put("result",result);
        return rk;
    }
}
