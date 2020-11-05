package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqCollageConfigureMapper;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.YqXyryfbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//@Service
//public class YqImpbodyServiceImpl implements YqImportantbodyService {
//    @Autowired
//    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
//    @Override
//    public JSONObject getYqImbodyInfo(){
//        JSONObject res = new JSONObject();
//        List<Map<String,Object>> mapResult  = yqFxdataCollectionMapper.getYqIbodyInfo();
//        System.out.println(mapResult);
//        res.put("mapResult",mapResult);
//        return res;
//    }
@Service
public class YqXyryfbServiceImpl implements YqXyryfbService {
    @Autowired
    private YqCollageConfigureMapper yqCollageConfigureMapper;
    @Autowired
    private YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Override
    public JSONObject getYqxyryfbInfo(){
        JSONObject re = new JSONObject();
        List<Map<String,Object>> r = yqCollageConfigureMapper.getXyryInfo();
        List<Map<String,Object>> r1 = yqWxgjCollectionMapper.getXyRyInfo();
        List<Double> lb = new ArrayList<>();
        Map<String,Object> mp = r.get(0);
        for (int i = 0; i < r1.size(); i++) {
            Map<String,Object> r2 = r1.get(i);
            System.out.println(r2);
            System.out.println(r2.entrySet());
            System.out.println(r2.get(2));
            Iterator iterator = r2.keySet().iterator();
//            System.out.println(iterator.next());
//            System.out.println(r2.get(iterator.next()));
            String strin = (String) iterator.next();
            while (iterator.hasNext()) {
                String string = (String) iterator.next();
                lb.add((Double) r2.get(string));
            }
            System.out.println(lb);
            System.out.println(strin);
            lb.removeIf(s -> s.equals(r2.get(strin)));

        }
        re.put("result",r);
        re.put("poits",r1);
        System.out.println(re);

        return re;
    }
}
