package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.service.YqFxTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YqFxTrafficServiceImpl implements YqFxTrafficService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Override
    public JSONObject getYqFxTrafficInfo(){
        JSONObject resultJsonObject =new JSONObject();
        List<Map<String,Object>> Result = yqFxdataCollectionMapper.getYqFxTrafficInfo();
        resultJsonObject.put("result", Result);
        return resultJsonObject;
    }
}
//    Integer[] count = new Integer[] { 0, 0, 0, 0, 0 };
//    JSONArray syinfoArrayObject = new JSONArray();
//        for (EpideSituDisplayModel syinfoValue : Result) {
//                String jtfs = syinfoValue.getName();
//                if (jtfs.length() != 5) {
//                break;
//                }
//                for (int i = 0; i < 5; i++) {
//        if (jtfs.substring(i, i + 1).equals("1")) {
//        count[i]++;
//        }
//        }
//        }
//        // A.汽车", "B.火车", "C.飞机", "D.私家车
//        JSONObject Object1 = new JSONObject();
//        Object1.put("name", "汽车");
//        Object1.put("value", count[0]);
//        syinfoArrayObject.add(Object1);
//        JSONObject Object2 = new JSONObject();
//        Object2.put("name", "火车");
//        Object2.put("value", count[1]);
//        syinfoArrayObject.add(Object2);
//        JSONObject Object3 = new JSONObject();
//        Object3.put("name", "高铁");
//        Object3.put("value", count[2]);
//        syinfoArrayObject.add(Object3);
//        JSONObject Object4 = new JSONObject();
//        Object4.put("name", "飞机");
//        Object4.put("value", count[3]);
//        syinfoArrayObject.add(Object4);
//        JSONObject Object5 = new JSONObject();
//        Object5.put("name", "私家车");
//        Object5.put("value", count[4]);
//        syinfoArrayObject.add(Object5);