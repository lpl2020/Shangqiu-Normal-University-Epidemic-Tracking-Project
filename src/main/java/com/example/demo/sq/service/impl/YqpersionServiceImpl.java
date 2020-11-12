package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.YqEntiContService;
import com.example.demo.sq.service.YqpersionService;
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
public class YqpersionServiceImpl implements YqpersionService {
    @Autowired
    YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Autowired
    YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Override
    public JSONObject getPersoionInfo(){
        JSONObject rg = new JSONObject();
        List<Map<String,Object>> Result=yqFxdataCollectionMapper.getPersionDataInfo();
        List<Map<String,Object>> result=yqFxhealthCollectionMapper.getPersionDataInfo();
        rg.put("Result",Result);
        rg.put("result",result);
        return rg;
    }

}
