package com.ghh.api.service;

import com.ghh.api.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description: 针对DeptClientService的所有熔断机制进行统一整理
 * @Date: Create in 22:14 2020/11/23
 * @Modified By:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDbSource("no this database has this source");
                dept.setDname("该id："+id+"不存在此数据 ,Consumer客户端提供的降级服务，此刻provider已关闭--@HystrixCommand");
                return dept;
            }

            @Override
            public Dept getTest() {
                return null;
            }
        };
    }
}
