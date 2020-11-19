package com.ghh.controller;

import com.ghh.api.entity.Dept;
import com.ghh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    DeptService deptService;

    @RequestMapping("findAll")
    public List<Dept> test(){

        return deptService.list();
    }



}
