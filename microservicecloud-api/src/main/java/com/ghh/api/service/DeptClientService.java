package com.ghh.api.service;

import com.ghh.api.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description: 部门项目的接口API文档
 * @Date: Create in 21:28 2020/11/22
 * @Modified By:
 */
//针对当前微服务的面向接口的编程,对应的接口出现异常后调用fallbackFactory。
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    /**
     * @Author: GuanHaoHao
     * @Description: 查询当前所有部门情况
     * @Date: 21:58 2020/11/22
    */
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);
}
