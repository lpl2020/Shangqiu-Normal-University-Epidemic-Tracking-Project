package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.YqActiveJkService;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class YqActiveJkServiceImpl implements YqActiveJkService {

    @Override
    public JSONObject getYqActiveJkInfo(){

        JSONObject resultJsonObject = new JSONObject();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("authoration", "apicode");
        headers.add("apicode", "65f2157f4fff4426b83519770ec5bd9b");

//		//解决转发问题
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        HttpClient httpClient = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build();

        factory.setHttpClient(httpClient);
        restTemplate.setRequestFactory(factory);
        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity(null, headers);
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("https://api.yonyoucloud.com/apis/dst/ncov/query");
        String resEntity = restTemplate.exchange(builder.build().toString(), HttpMethod.GET, request, String.class)
                .getBody();
        JSONObject jsonResult = JSONObject.parseObject(resEntity);
        if (!"200".equals(jsonResult.getString("code"))) {
            resultJsonObject.put("errorCode", "4000");
            return resultJsonObject;
        }

        List<String> result = new ArrayList<>();
        JSONArray newsList = jsonResult.getJSONArray("newslist");
        JSONArray newList = newsList.getJSONObject(0).getJSONArray("news");
        for (int i = 0; i < newList.size(); i++) {
            String summary = newList.getJSONObject(i).getString("summary");
            result.add(summary);
//            logger.info("-------------------" + newList.get(i));
        }

        resultJsonObject.put("result", result);

        return resultJsonObject;
    }
}
