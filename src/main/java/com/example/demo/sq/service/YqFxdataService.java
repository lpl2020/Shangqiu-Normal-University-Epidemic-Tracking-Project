package com.example.demo.sq.service;

import com.alibaba.fastjson.JSONObject;
/**
 * 接口1、 大屏最顶端信息：返校人数 外省返校人数 境外返校人数 重点观察人数
 *
 * @return
 */
public interface YqFxdataService {
    JSONObject getYqFxdataInfo(String school);
}
