package com.example.demo.sq.service;

import com.alibaba.fastjson.JSONObject;

public interface rootService {

    JSONObject getloginInfo(String school,String user,String password);
}
