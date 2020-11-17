package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.entity.*;
import com.example.demo.sq.mappers.*;
import com.example.demo.sq.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import com.example.demo.sq.entity.YqVisitinfoInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WeChatServiceImpl implements WeChatService {
    @Autowired
    private YqCollageConfigureMapper yqCollageConfigureMapper;
    @Autowired
    private YqWxgjCollectionMapper yqWxgjCollectionMapper;
    @Autowired
    private YqSchoolDepartmentMapper yqSchoolDepartmentMapper;
    @Autowired
    private YqStudentInfoMapper yqStudentInfoMapper;
    @Autowired
    private YqFxhealthCollectionMapper yqFxhealthCollectionMapper;
    @Autowired
    private YqFxdataCollectionMapper yqFxdataCollectionMapper;
    @Autowired
    private YqVisitinfoInfoMapper yqVisitinfoInfoMapper;



    // 1:每天健康数据采集
    @Override
    public JSONObject postYqMtjkinf(Map params) {
        JSONObject resultJsonObject = new JSONObject();
        resultJsonObject.put("errorCode", 0);
        resultJsonObject.put("msg", "获取成功");
        if (null == params.get("school") || null == params.get("name") || null == params.get("no")
                || null == params.get("date") || null == params.get("heathinfo1") || null == params.get("heathinfo2")
                || null == params.get("heathinfo3") || null == params.get("timestamp") || null == params.get("notes")
                || null == params.get("temperature") || null == params.get("isQuarantine")) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            String school = params.get("school").toString();
            String name = params.get("name").toString();
            String no = params.get("no").toString();
            String heathinfo1 = params.get("heathinfo1").toString();
            Integer heathinfo2 = Integer.valueOf(params.get("heathinfo2").toString());
            Integer heathinfo3 = Integer.valueOf(params.get("heathinfo3").toString());
            String temperature = params.get("temperature").toString();
            String isQuarantine = params.get("isQuarantine").toString();
            String notes = params.get("notes").toString();
            String date = params.get("date").toString();

            YqFxhealthCollection wxApiData = new YqFxhealthCollection();
            wxApiData.setSchool(school);
            wxApiData.setUserName(name);
            wxApiData.setUserNo(no);
            wxApiData.setHeathinfo1(heathinfo1);
            wxApiData.setHeathinfo2(heathinfo2);
            wxApiData.setHeathinfo3(heathinfo3);
            wxApiData.setTimestamp(date);
            wxApiData.setIsQuarantine(isQuarantine);
            wxApiData.setTemperature(temperature);
            wxApiData.setNotes(notes);
            yqFxhealthCollectionMapper.insert(wxApiData);
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "写入数据库成功");
            return resultJsonObject;
        } catch (Exception e) {
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 2:返校报到数据采集
    @Override
    public JSONObject postYqFxbdinfo(Map params) {
        JSONObject resultJsonObject = new JSONObject();
        //校验参数
        if(null == params.get("school") || null == params.get("name")|| null == params.get("no")
                || null == params.get("fxdate")|| null == params.get("fxaddr_country")
                || null == params.get("fxaddr_province")|| null == params.get("fxaddr_city")
                || null == params.get("fxaddr_town") || null == params.get("fxjt")
                || null == params.get("is_thSeriousarea") || null == params.get("fxjt_sm")
                || null == params.get("fxjk")
        ) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try{
            String school = params.get("school").toString();
            String name = params.get("name").toString();
            String no = params.get("no").toString();
            String fxTime = params.get("fxdate").toString();
            String fxAddrCountry = params.get("fxaddr_country").toString();
            String fxAddrProvince = params.get("fxaddr_province").toString();
            String fxAddrCity = params.get("fxaddr_city").toString();
            String fxAddrTown = params.get("fxaddr_town").toString();
            Integer isThseriousarea = Integer.valueOf(params.get("is_thSeriousarea").toString());
            String fxVehicl = params.get("fxjt").toString();
            String fxjtSm = params.get("fxjt_sm").toString();
            String fxjk = params.get("fxjk").toString();
            YqFxdataCollection wxApiData = new YqFxdataCollection();
            wxApiData.setSchool(school);
            wxApiData.setUsername(name);
            wxApiData.setUserno(no);
            wxApiData.setFxtime(fxTime);
            wxApiData.setFxcountry(fxAddrCountry);
            wxApiData.setFxprovince(fxAddrProvince);
            wxApiData.setFxcity(fxAddrCity);
            wxApiData.setFxtown(fxAddrTown);
            wxApiData.setFxvehicle(fxVehicl);
            wxApiData.setThroughepidemicarea(isThseriousarea);
            wxApiData.setFxjk(fxjk);
            wxApiData.setTrainnum(fxjtSm);
            yqFxdataCollectionMapper.postYqFxbdinfo(wxApiData);
            yqFxhealthCollectionMapper.postYqjkinfo(wxApiData);
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "写入数据库成功");
            return resultJsonObject;
        }catch (Exception e){
            resultJsonObject.put("errorCode", 1);//错误码4000参数为空 4001参数不正确， 4002认证失败
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }

    }

    // 3:学生扫码数据采集
    @Override
    public JSONObject postYqSaomainfo(Map params) {
        JSONObject resultJsonObject = new JSONObject();
        //校验参数
        if(null == params.get("school") || null == params.get("name")|| null == params.get("no")|| null == params.get("addr")
                || null == params.get("longitude")|| null == params.get("time")|| null == params.get("dimension")
        ) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            //解析参数
            String school = params.get("school").toString();
            String name = params.get("name").toString();
            String no = params.get("no").toString();
            String addr = params.get("addr").toString();
            Double longitude = Double.valueOf(params.get("longitude").toString());
            Double dimension = Double.valueOf(params.get("dimension").toString());
            DateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = (String) params.get("time");
            Date date = ft.parse(time);

            YqWxgjCollection wxApiData = new YqWxgjCollection();
            wxApiData.setSchool(school);
            wxApiData.setUserName(name);
            wxApiData.setUserNo(no);
            wxApiData.setAddr(addr);
            wxApiData.setLongitude(longitude);
            wxApiData.setDimension(dimension);
            wxApiData.setTime(date);

            yqWxgjCollectionMapper.postYqSaomainfo(wxApiData);
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "写入数据库成功");
            return resultJsonObject;
        }catch (Exception e){
            e.printStackTrace();
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 4:学生注册信息采集
    @Override
    public JSONObject postYqZhuceinfo(Map params) {
        JSONObject resultJsonObject = new JSONObject();

        //校验参数
        if(null == params.get("school") || null == params.get("college")|| null == params.get("name")
                || null == params.get("no")|| null == params.get("sex")|| null == params.get("age")
                || null == params.get("banji") || null == params.get("phone")|| null == params.get("role")
                || null == params.get("password")|| null == params.get("parentPhone")) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            //解析参数
            String school = params.get("school").toString();
            String college = params.get("college").toString();
            String name = params.get("name").toString();
            String no = params.get("no").toString();
            String sex = params.get("sex").toString();
            String age = params.get("age").toString();
            String banji = params.get("banji").toString();
            String password = params.get("password").toString();
            String phone = params.get("phone").toString();
            String depart = "";
            Integer personType =Integer.parseInt(params.get("role").toString());
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
            String parentPhone = params.get("parentPhone").toString();

            if(null != params.get("depart")) {
                depart = params.get("depart").toString();
            }

            YqStudentInfo wxApiData = new YqStudentInfo();
            wxApiData.setSchool(school);
            wxApiData.setCollege(college);
            wxApiData.setUserName(name);
            wxApiData.setUserNo(no);
            wxApiData.setSex(sex);
            wxApiData.setAge(age);
            wxApiData.setClasses(banji);
            wxApiData.setPhone(phone);
            wxApiData.setMd5Password(md5Password);
            wxApiData.setPersonType(personType);
            wxApiData.setDepartment(depart);
            wxApiData.setParentsPhone(parentPhone);

            yqStudentInfoMapper.postYqZhuceinfo(wxApiData);

            List<YqStudentInfo> userInfolist = yqStudentInfoMapper.getYqZhuceinfo(no);
            if(userInfolist.size()>0) {
                resultJsonObject.put("errorCode", 1);
                resultJsonObject.put("msg", "该学号已经注册过请勿重复注册");
                return resultJsonObject;
            }
            return resultJsonObject;
        }catch (Exception e){
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);//错误码4000参数为空 4001参数不正确， 4002认证失败
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 5:登录配置
    @Override
    public JSONObject postYqLogin(Map params) {

        JSONObject resultJsonObject = new JSONObject();
        // 校验参数
        if(null == params.get("no") || null == params.get("password")) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            String no = params.get("no").toString();
            String password = params.get("password").toString();
            List<YqStudentInfo> userInfolist  =  yqStudentInfoMapper.getYqLogin(no,password);
            if(userInfolist.size()==0) {
                resultJsonObject.put("errorCode", 1);//错误码4000参数为空 4001参数不正确， 4002认证失败
                resultJsonObject.put("msg", "账号密码不匹配");
                return resultJsonObject;
            }
            JSONObject userinfo = new JSONObject();
            userinfo.put("college", userInfolist.get(0).getSchool());
            userinfo.put("school", userInfolist.get(0).getCollege());
            userinfo.put("name", userInfolist.get(0).getUserName());
            userinfo.put("no", userInfolist.get(0).getUserNo());
            userinfo.put("banji", userInfolist.get(0).getClasses());
            userinfo.put("phone", userInfolist.get(0).getPhone());
            userinfo.put("role", userInfolist.get(0).getPersonType());
            userinfo.put("depart", userInfolist.get(0).getDepartment());
            userinfo.put("parentPhone", userInfolist.get(0).getParentsPhone());

            List<YqFxhealthCollection> jkSubmit  =  yqFxhealthCollectionMapper.jkSubmit(userInfolist.get(0).getSchool(),userInfolist.get(0).getUserNo());
            List<YqFxdataCollection> jtSubmit  =  yqFxdataCollectionMapper.jtSubmit(userInfolist.get(0).getSchool(),userInfolist.get(0).getUserNo());
            if(jkSubmit.size()==0) {
                userinfo.put("is_submit_mrjk", 0);
            }else {
                userinfo.put("is_submit_mrjk", 1);
            }
            if(jtSubmit.size()==0) {
                userinfo.put("is_submit_kxbd", 0);
            }else {
                userinfo.put("is_submit_kxbd", 1);
            }
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "登录成功");
            resultJsonObject.put("userinfo",userinfo);
        } catch (Exception e) {
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或读取数据库失败");
            return resultJsonObject;
        }
        return resultJsonObject;
    }

    // 6:获取学校学院以及专业列表
    @Override
    public JSONObject postGetCollagelist() {
        JSONObject result = new JSONObject();
        JSONObject resultJsonObject = new JSONObject();
        try {
            List<YqCollageConfigure> shcoolList = yqCollageConfigureMapper.postGetschoollist();
            for (YqCollageConfigure school:shcoolList){
                String schools = school.getSchool();
                List<YqCollageConfigure> collageList = yqCollageConfigureMapper.postGetcollagelist(schools);
                JSONObject collageObject = new JSONObject();
                for (YqCollageConfigure collage:collageList){
                    String collages = collage.getCollege();
                    List<YqCollageConfigure> personllityList = yqCollageConfigureMapper.postpersonallitylist(schools, collages);
                    JSONArray personnallity= new JSONArray();
                    for(YqCollageConfigure personallity:personllityList) {
                        personnallity.add(personallity.getClasses());
                    }
                    collageObject.put(collages,personnallity);
                }
                result.put(schools, collageObject);
            }
            resultJsonObject.put("result",result);
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "获取成功");
            return resultJsonObject;
        }catch (Exception e){
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 7:获取扫码历史列表
    @Override
    public JSONObject postGetScanninglist(Map params) {
        JSONObject resultJsonObject = new JSONObject();

        //校验参数
        if(null == params.get("school") || null == params.get("no")) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            //解析参数
            JSONArray result= new JSONArray();
            String school = params.get("school").toString();
            String no = params.get("no").toString();
            List<YqWxgjCollection> scanningList = yqWxgjCollectionMapper.postGetScanninglist(school,no);
            for(YqWxgjCollection scanning:scanningList) {
                result.add(scanning.getTimestamp().substring(0, 19)+" "+scanning.getAddr()+"扫码");
            }
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "获取扫码历史列表成功");
            resultJsonObject.put("result",result);
            return resultJsonObject;
        } catch (Exception e) {
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 8:提交来访人员信息
    @Override
    public JSONObject postSavevisitorinfo(Map params) {
        JSONObject resultJsonObject = new JSONObject();
        //校验参数
        if(null == params.get("school") || null == params.get("name")|| null == params.get("phone")
                || null == params.get("toname")|| null == params.get("tophone")|| null == params.get("visitinfo")) {
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "参数为空或不完整");
            return resultJsonObject;
        }
        try {
            //解析参数
            String school = params.get("school").toString();
            String name = params.get("name").toString();
            String phone = params.get("phone").toString();
            String toname = params.get("toname").toString();
            String tophone = params.get("tophone").toString();
            String visitinfo = params.get("visitinfo").toString();

            YqVisitinfoInfo wxApiData= new YqVisitinfoInfo();
            wxApiData.setSchool(school);
            wxApiData.setName(name);
            wxApiData.setPhone(phone);
            wxApiData.setToname(toname);
            wxApiData.setTophone(tophone);
            wxApiData.setVisitinfo(visitinfo);
            yqVisitinfoInfoMapper.postSavevisitorinfo(wxApiData);
            resultJsonObject.put("errorCode", 0);
            resultJsonObject.put("msg", "提交成功");
            return resultJsonObject;
        }catch (Exception e){
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "解析或写入数据库失败");
            return resultJsonObject;
        }
    }

    // 9:获取行政部门信息
    @Override
    public JSONObject postGetDepartlist() {
        JSONObject resultJsonObject = new JSONObject();
        resultJsonObject.put("errorCode", 0);
        resultJsonObject.put("msg", "获取行政部门信息成功");
        //校验参数
        List<YqSchoolDepartment> departlist = yqSchoolDepartmentMapper.getdepartlist();
        JSONObject result = new JSONObject();
        JSONArray schoolList= new JSONArray();
        for(YqSchoolDepartment schoolInfo: departlist) {
            String school = schoolInfo.getSchool();
            boolean flag = false;
            for(int i = 0 ;i<schoolList.size();i++) {
                if(school.equals(schoolList.get(i))) {
                    flag= true;
                }
            }
            if(flag) {
                continue;
            }
            JSONArray departmentList= new JSONArray();
            for(YqSchoolDepartment departInfo: departlist) {
                if(school.equals(departInfo.getSchool())) {
                    departmentList.add(departInfo.getDepartment());
                }
            }
            schoolList.add(school);
            result.put(school, departmentList);
        }
        resultJsonObject.put("result", result);
        try {
        } catch (Exception e) {
            // TODO: handle exception
            resultJsonObject.put("errorCode", 1);
            resultJsonObject.put("msg", "获取失败");
            return resultJsonObject;
        }
        return resultJsonObject;
    }

}
