package com.example.demo.sq.controller;

<<<<<<< HEAD
import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import com.example.demo.sq.mappers.YqFxhealthCollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YqFxhealthController {
    @Autowired
    private YqFxhealthCollectionMapper YqFxhealthCollectionMapper;
    @RequestMapping(value = "/hello/{id}")
    public YqFxhealthCollection getYqFxhealth(@PathVariable("id") Integer id){
        return YqFxhealthCollectionMapper.getId(id);
    }

=======
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.YqFxhealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//注解的方式进行配置
@RestController// 返回json字符串的数据，直接可以编写RESTFul的接口
@ResponseBody

@RequestMapping("/student")
 // @SpringBootApplication声明让spring boot自动给程序进行必要的配置
public class YqFxhealthController {

    @Autowired
    private YqFxhealthService yqFxhealthService;

    @RequestMapping(value = "/getYqFxhealthInfo", method = RequestMethod.GET)
    public JSONObject YqFxhealthInfo(){
        return yqFxhealthService.getYqFxhealthInfo();
    }
//    @RequestMapping(value = "/YqCity/{id}", method = RequestMethod.GET)
>>>>>>> origin/master

}
