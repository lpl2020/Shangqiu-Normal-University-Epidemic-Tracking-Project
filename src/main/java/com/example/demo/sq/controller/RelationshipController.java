package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.RelationshipService;
import com.example.demo.sq.service.YqRmlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController//返回json字符串的数据，直接可以编写RESTFul的接口
//@SpringBootApplication//@SpringBootApplication声明让spring boot自动给程序进行必要的配置
@RequestMapping("/corocon/relatpMap")  //配置系统拦截url
/**
 getMainRelat 接口一
 *
 */
public class RelationshipController {
    @Autowired
    private RelationshipService relationshipService;

    @RequestMapping(value = "getMainRelat",method = RequestMethod.GET)
    public JSONObject getYqrmlyServiceInfo(@RequestParam(value = "school", required = false) String school){
        return relationshipService.getRelationship(school);
    }

    /*
   postMainRelat  接口二
     */
    @PostMapping(value = "/postMainRelat")
    public JSONObject Relationship(@RequestBody Map params
    ){
        System.out.println(params);
        return relationshipService.postRelationshipMap(params);
    }
}




