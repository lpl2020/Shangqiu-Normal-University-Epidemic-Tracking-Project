package com.example.demo.sq.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.sq.service.StudentService;
import com.example.demo.sq.service.rootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

//@RestController
//@RequestMapping("/student")
//public class StudentController {
    //    测试类
    //@Autowired
   // private StudentService studentService;

   // @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
    //public JSONObject StudentInfo(){
        //return studentService.getStudentInfo();
   // }
//}
@RestController
@RequestMapping("/student")
public class rootcontroller {
       @Autowired
       private rootService rootservice;
       @RequestMapping(value = "/getloginInfo", method = RequestMethod.GET)

       public JSONObject loginInfo() {

           return rootservice.getloginInfo();
       }
   }
