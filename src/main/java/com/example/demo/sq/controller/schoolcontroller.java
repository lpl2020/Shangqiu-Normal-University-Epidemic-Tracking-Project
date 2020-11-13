package com.example.demo.sq.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.rootService;
import com.example.demo.sq.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.sq.service.schoolService;
import java.util.List;

@RestController
@RequestMapping("/root")
public class schoolcontroller {
    @Autowired
    private schoolService schoolService;

    @RequestMapping(value="/getSchoolList",method= RequestMethod.GET)
    public Object getSchoolList()
    {
        return schoolService.getSchoolInfo();
    }

}
