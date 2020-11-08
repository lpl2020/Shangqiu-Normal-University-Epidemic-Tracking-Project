package com.example.demo.sq.service;

import com.alibaba.fastjson.JSONObject;
/**
 * 接口3、 重点观察人员：姓名、学院、来源地、来源地确诊人数
 *
 * @return
 */
public interface YqImportantbodyService {
    JSONObject getYqImbodyInfo(String school);
}
