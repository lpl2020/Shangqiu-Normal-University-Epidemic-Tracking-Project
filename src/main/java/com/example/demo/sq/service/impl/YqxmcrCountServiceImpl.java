package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.YqxmcrCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.sq.mappers.YqStudentInfoMapper;
//import com.example.demo.sq.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class StudentServiceImpl implements StudentService {
//    @Autowired
//    private YqStudentInfoMapper yqStudentInfoMapper;
//
//    @Override
//    public JSONObject getStudentInfo() {
//        JSONObject res = new JSONObject();
//        List<Map<String,Object>> mapResult  = yqStudentInfoMapper.getStudentInfo();
//        res.put("mapResult",mapResult);
//        System.out.println(res);
//        return res;
//    }
//}
@Service
public class YqxmcrCountServiceImpl implements YqxmcrCountService {
    @Autowired
    private YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Override
    public JSONObject getYqXmcrCountInfo(){
          JSONObject ra = new JSONObject();
          List<Map<String,Object>> result = yqWxgjCollectionMapper.getXmcrCountDataInfo();
          ra.put("result",result);
          return ra;
      }

}
