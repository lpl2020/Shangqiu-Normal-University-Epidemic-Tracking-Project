package com.example.demo.sq.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.mappers.YqStudentInfoMapper;
import com.example.demo.sq.mappers.YqWxgjCollectionMapper;
import com.example.demo.sq.service.StudentService;
import com.example.demo.sq.service.YqsygrxysjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
public class YqsygrxysjServiceImpl  implements YqsygrxysjService {
    @Autowired
    private YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Override
    public JSONObject getYqsygrxysjInfo(){
        JSONObject rw = new JSONObject();
        List<Map<String,Object>> mapResult  = yqWxgjCollectionMapper.getSygrxysjDataInfo();
        rw.put("mapResult",mapResult);
        return rw;
    }
}
