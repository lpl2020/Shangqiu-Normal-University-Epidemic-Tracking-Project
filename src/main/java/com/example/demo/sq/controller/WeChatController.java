package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Map;


@RestController
@RequestMapping("/corocon/postWxApi")
public class WeChatController {

    @Autowired
    private WeChatService weChatService;

    /**
     * 接口1：每天健康数据采集
     * 	Value=”/yq_mtjkinfo”    (”/yq_everyDayInfo”)
     * 	Methord= RequestMethod.POST
     * 	请求参数：school String,name String,no String,healthyInfo String,date String
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_mtjkinfo")
    public JSONObject postYqMtjkinfo(@RequestBody Map params
    ){
        System.out.println(params);
        return weChatService.postYqMtjkinf(params);
    }

    /**
     * 接口2：返校报到数据采集
     * 	Value=”/yq_fxbdinfo”
     * 	Method=RequestMethod.POST
     * 	School+name+no+addr+time+fxaddrCountry+fxaddr_province
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_fxbdinfo")
    public JSONObject postYqFxbdinfo(@RequestBody Map params){
        System.out.println(params);
        return weChatService.postYqFxbdinfo(params);
    }

    /**
     * 接口3：学生扫码数据采集
     * 	Value=”/yq_saomainfo
     * 	Method=RequestMethod.POST
     * 	School+name+no+addr+time
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_saomainfo")
    public JSONObject postYqSaomainfo(@RequestBody Map params){
        System.out.println(params);
        return weChatService.postYqSaomainfo(params);
    }

    /**
     * 接口4：学生注册信息采集
     * 	Value=”/yq_zhuceinfo”
     *  Method=RequestMethod.POST
     * 	College+school+name+np+class+phone+password
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_zhuceinfo")
    public JSONObject postYqZhuceinfo(@RequestBody Map params){
        System.out.println(params);
        return weChatService.postYqZhuceinfo(params);
    }

    /**
     * 接口5：学生登陆接口
     * 	Value=”/yq_login”
     * 	Method=RequestMethod.POST
     * 	No+password
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_loginas")
    public JSONObject postYqLogin(
            @RequestBody Map params
    ){
        System.out.println(params);
        return weChatService.postYqLogin(params);
    }

    /**
     * 接口6：获取学校列表
     * 	Value=”/yq_getcollageList
     * 	Mathod= RequestMethod.POST
     * @return
     */
    @PostMapping(value = "/yq_getcollagelist")
    public JSONObject postGetCollagelist(){
        return weChatService.postGetCollagelist();
    }

    /**
     * 接口7：获取扫码历史列表
     * 	Value=”/yq_getsaomalist”
     * 	Mathod= RequestMethod.POST
     * @return
     */
    @PostMapping(value = "/yq_getsaomalist")
    public JSONObject postGetScanninglist(
            @RequestBody Map params
    ) {
        System.out.println(params);
        return weChatService.postGetScanninglist(params);
    }

    /**
     * 接口8：提交来访人员信息
     * 	Value=”/yq_saveVisitorinfo”
     * 	Mathod= RequestMethod.POST
     * 	School+name+phone+toname+tophone+visitinfo
     * @param params
     * @return
     */
    @PostMapping(value = "/yq_saveVisitorinfo")
    public JSONObject postSavevisitorinfo(@RequestBody Map params){
        System.out.println(params);
        return weChatService.postSavevisitorinfo(params);
    }

    /**
     * 接口9：获取行政部门信息
     * 	Value=”/yq_getdepartList”
     * 	Method= RequestMethod.POST
     * 	School+department
     * @return
     */
    @PostMapping(value = "/yq_getdepartList")
    public JSONObject postGetDepartlist(){
        return weChatService.postGetDepartlist();
    }
}
