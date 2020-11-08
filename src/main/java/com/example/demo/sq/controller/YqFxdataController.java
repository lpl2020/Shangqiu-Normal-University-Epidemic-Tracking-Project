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
    public JSONObject YqFxhealthServiceInfo(@RequestParam(value = "school", required = false) String school
    ) {
        System.out.println(school);
        return yqFxdataService.getYqFxdataInfo(school);
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
    public JSONObject getYqjkdataServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqjkdataService.getYqjkdataInfo(school);
    }
    /**
     * 接口3、 重点观察人员：姓名、学院、来源地、来源地确诊人数
     *
     * @return
     */
    @Autowired
    private YqImportantbodyService yqImportantbodyService;
    @RequestMapping(value = "/sy_zdgcryinfo", method = RequestMethod.GET)
    public JSONObject getYqImpdataServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqImportantbodyService.getYqImbodyInfo(school);
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
    public JSONObject getYqxyryfbServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqXyryfbService.getYqxyryfbInfo(school);
    }
    /**
     * 接口5、 预警信息:学生或老师扫码事件
     *
     * @return
     */
    @Autowired
    private YqXyyjService yqXyyjService;
    @RequestMapping(value = "sy_yjinfo",method = RequestMethod.GET)
    public JSONObject getYqxyyjServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqXyyjService.getYqxyyjInfo(school);
    }
    /**
     * 接口6、热门来源
     *
     * @return
     */
    @Autowired
    private YqRmlyService yqRmlyService;
    @RequestMapping(value = "sq_rmlyinfo",method = RequestMethod.GET)
    public JSONObject getYqrmlyServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqRmlyService.getYqrmlyInfo(school);
    }
    /**
     * 接口7、返校交通
     *
     * @return
     */
    @Autowired
    private YqFxTrafficService yqFxTrafficService;
    @RequestMapping(value = "sy_fxjtinfo",method = RequestMethod.GET)
    public JSONObject getYqFxTrafServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqFxTrafficService.getYqFxTrafficInfo(school);
    }
    /**
     * 接口8、返校人员来源：学校gps
     *
     * @return
     */
    @Autowired
    private YqFxrylyService yqFxrylyService;
    @RequestMapping(value = "sy_fxrylyinfo",method = RequestMethod.GET)
    public JSONObject getYqFxrylyServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqFxrylyService.getYqFxrylyInfo(school);
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
    public JSONObject getYqEveryYuanFxdataServiceInfo(@RequestParam(value = "school", required = false) String school){
        return yqEveryYuanFxdataService.getYqEveryYuanFxdataInfo(school);
    }
}
