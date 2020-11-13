package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/getStudentInfo")
    public JSONObject StudentInfo(){
        return studentService.getStudentInfo();
    }

}
