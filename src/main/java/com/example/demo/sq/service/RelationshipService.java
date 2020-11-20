package com.example.demo.sq.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface RelationshipService {
    JSONObject getMainRelatInfo(String userId);
    JSONObject postRelationshipMap(String userId,String acessToken);

    JSONObject postYqMtjkinf(Map params);

    JSONObject postRelationshipMap(Map params);

    JSONObject getRelationship(String school);
}
