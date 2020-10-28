package com.example.demo.sq.controller;

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


}
