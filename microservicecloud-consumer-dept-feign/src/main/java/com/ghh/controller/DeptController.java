package com.ghh.controller;

import com.ghh.api.entity.Dept;
import com.ghh.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:41 2020/11/18
 * @Modified By:
 */
@RestController
public class DeptController {

    @Autowired
    DeptClientService clientService;

    @RequestMapping("findAll")
    public List<Dept> test(){
        List<Dept> list = clientService.list();
        return list;
    }

    @RequestMapping("findById/{id}")
    public Dept findById(@PathVariable("id")Long id){
        Dept dept = clientService.get(id);
        return dept;
    }
    @RequestMapping("test")
    public Dept test1(){
        Dept test = clientService.getTest();
        return test;
    }
}
