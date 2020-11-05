package com.example.demo.sq.controller;

import com.example.demo.sq.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

@RestController// 返回json字符串的数据，直接可以编写RESTFul的接口
@RequestMapping("/student")
public class YqFxdataController {
    /**
     * 接口1、 大屏最顶端信息：返校人数 外省返校人数 境外返校人数 重点观察人数
     *
     * @return
     */
    @Autowired
    private YqFxdataService yqFxdataService;
    @RequestMapping(value = "/sy_baseinfo", method = RequestMethod.GET)
    public JSONObject YqFxhealthServiceInfo() {
        return yqFxdataService.getYqFxdataInfo();
    }

    /**
     * 接口2、 疫情监控数据：(全国、全省、全市、全校)
     *累计确诊、境外输入确诊、现有确诊、现有疑似、累计治愈、累计死亡
     *
     * @return
     */
    @Autowired
    private YqjkdataService yqjkdataService;
    @RequestMapping(value = "/sy_yqjkinfo", method = RequestMethod.POST)
    public JSONObject getYqjkdataServiceInfo(){
        return yqjkdataService.getYqjkdataInfo();
    }
    /**
     * 接口3、 重点观察人员：姓名、学院、来源地、来源地确诊人数
     *
     * @return
     */
    @Autowired
    private YqImportantbodyService yqImportantbodyService;
    @RequestMapping(value = "/sy_zdgcryinfo", method = RequestMethod.GET)
    public JSONObject getYqImpdataServiceInfo(){
        return yqImportantbodyService.getYqImbodyInfo();
    }
//    校园人员分布：校园中心gps（百度地图）
    /**
     * 接口4、 校园人员分布：校园中心gps（百度地图）
     *
     * @return
     */
    @Autowired
    private YqXyryfbService yqXyryfbService;
    @RequestMapping(value = "/sy_xyryfbinfo", method = RequestMethod.GET)
    public JSONObject getYqxyryfbServiceInfo(){
        return yqXyryfbService.getYqxyryfbInfo();
    }
    /**
     * 接口5、 预警信息:学生或老师扫码事件
     *
     * @return
     */
    @Autowired
    private YqXyyjService yqXyyjService;
    @RequestMapping(value = "sy_yjinfo",method = RequestMethod.GET)
    public JSONObject getYqxyyjServiceInfo(){
        return yqXyyjService.getYqxyyjInfo();
    }
    /**
     * 接口6、热门来源
     *
     * @return
     */
    @Autowired
    private YqRmlyService yqRmlyService;
    @RequestMapping(value = "sq_rmlyinfo",method = RequestMethod.GET)
    public JSONObject getYqrmlyServiceInfo(){
        return yqRmlyService.getYqrmlyInfo();
    }
    /**
     * 接口7、返校交通
     *
     * @return
     */
    @Autowired
    private YqFxTrafficService yqFxTrafficService;
    @RequestMapping(value = "sy_fxjtinfo",method = RequestMethod.GET)
    public JSONObject getYqFxTrafServiceInfo(){
        return yqFxTrafficService.getYqFxTrafficInfo();
    }
    /**
     * 接口8、返校人员来源：学校gps
     *
     * @return
     */
    @Autowired
    private YqFxrylyService yqFxrylyService;
    @RequestMapping(value = "sy_fxrylyinfo",method = RequestMethod.GET)
    public JSONObject getYqFxrylyServiceInfo(){
        return yqFxrylyService.getYqFxrylyInfo();
    }
    /**
     * 接口9、疫情动态接口
     *
     * @return
     */
    @Autowired
    private YqActiveJkService yqActiveJkService;
    @RequestMapping(value = "sy_yqdtinfo",method = RequestMethod.GET)
    public JSONObject getYqActiveJkServiceInfo(){
        return yqActiveJkService.getYqActiveJkInfo();
    }
    /**
     * 接口10、各个学院返校信息
     *
     * @return
     */
    @Autowired
    private YqEveryYuanFxdataService yqEveryYuanFxdataService;
    @RequestMapping(value = "sy_ejxyfxinfo",method = RequestMethod.GET)
    public JSONObject getYqEveryYuanFxdataServiceInfo(){
        return yqEveryYuanFxdataService.getYqEveryYuanFxdataInfo();
    }
}
