package com.example.demo.sq.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.YqFxdataService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.sq.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import com.alibaba.fastjson.JSONObject;
//
//@RestController
//@RequestMapping("/student")
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
//    public JSONObject StudentInfo(){
//        return studentService.getStudentInfo();
//    }
//
//}
  @RestController
  @RequestMapping("/student")
  public class YqFxdataController {
      @Autowired
      private YqFxdataService yqfxdataService;

      @RequestMapping(value ="/getYqFxdatacollection()",method = RequestMethod.GET)
      public JSONObject getYqFxdatacollection(){
          return yqfxdataService.getYqFxdatacollection();
      }
  }
