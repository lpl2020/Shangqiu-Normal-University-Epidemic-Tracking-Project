package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqFxdataCollectionMapper;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import com.example.demo.sq.service.YqFxdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class YqFxdataServiceImpl implements YqFxdataService {
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Autowired
    private YqFxhealthCollectionMapper yqFxhealthCollectionMapper;

    /**
     * 接口1、 大屏最顶端信息：返校人数 外省返校人数 境外返校人数 重点观察人数
     *
     * @return
     */
    @Override
    public JSONObject getYqFxdataInfo(String school,String province) {
        try {
            JSONObject res = new JSONObject();
            List<Map<String, Object>> mapResult = yqFxdataCollectionMapper.getFxdataInfo(school,province);
            List<Map<String, Object>> Result = yqFxhealthCollectionMapper.getFxdataInfo(school);
            for (int i = 0; i < mapResult.size(); i++) {
                Map<String, Object> r = mapResult.get(i);
                for (int j = 0; j < Result.size(); j++) {
                    Map<String, Object> re = Result.get(j);
                    System.out.println(re);
                    Iterator iterator = re.keySet().iterator();
                    while (iterator.hasNext()) {
                        String string = (String) iterator.next();
                        System.out.println(re.get(string));
                        r.put("zdgc_num", re.get(string));
                    }
                }
            }
            res.put("result", mapResult);
            return res;
        } catch (Exception e) {
            System.out.println("fales");
        }
        return null;

    }


}