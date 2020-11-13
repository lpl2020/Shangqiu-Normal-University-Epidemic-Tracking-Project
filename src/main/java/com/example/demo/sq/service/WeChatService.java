package com.example.demo.sq.service;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface WeChatService {

    // 1:每天健康数据采集
    JSONObject postYqMtjkinf(Map params);

    // 2:返校报到数据采集
    JSONObject postYqFxbdinfo(Map params);

    // 3:学生扫码数据采集
    JSONObject postYqSaomainfo(Map params);

    // 4:学生注册信息采集
    JSONObject postYqZhuceinfo(Map params);

    // 5:登录配置
    JSONObject postYqLogin(Map params);

    // 6:获取学校学院以及专业列表
    JSONObject postGetCollagelist();

    // 7:获取扫码历史列表
    JSONObject postGetScanninglist(Map params);

    // 8:提交来访人员信息
    JSONObject postSavevisitorinfo(Map params);

    // 9:获取行政部门信息
    JSONObject postGetDepartlist();

}
