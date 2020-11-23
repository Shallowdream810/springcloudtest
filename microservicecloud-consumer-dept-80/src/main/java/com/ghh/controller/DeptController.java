package com.ghh.controller;

import com.ghh.api.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:41 2020/11/18
 * @Modified By:
 */
@RestController
public class DeptController {

    @Value("${REST_URL}")
    private  String REST_URL;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("testRibbon")
    public String testRibbon(String text){
        return restTemplate.getForObject(REST_URL+"testRibbon",String.class,text);
    }
    @RequestMapping("findAll")
    public List<Dept> test(){
        List<Dept> dept = restTemplate.getForObject(REST_URL + "findAll", List.class);
        return dept;
    }

    @RequestMapping("findById/{id}")
    public Dept findById(@PathVariable("id")Long id){
        Map map = new HashMap();
        map.put("id",id);
        ResponseEntity forEntity = restTemplate.getForEntity(REST_URL + "findById/" + id, Dept.class, map);
        Dept body = (Dept)forEntity.getBody();
        return body;
    }

    @RequestMapping("consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL+"dept/discovery",Object.class);
    }
}
