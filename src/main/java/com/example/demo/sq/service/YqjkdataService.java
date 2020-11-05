package com.example.demo.sq.service;

import com.alibaba.fastjson.JSONObject;
/**
 * 接口2、 疫情监控数据：(全国、全省、全市、全校)
 *累计确诊、境外输入确诊、现有确诊、现有疑似、累计治愈、累计死亡
 *
 * @return
 */
public interface YqjkdataService {
    JSONObject getYqjkdataInfo();
}
