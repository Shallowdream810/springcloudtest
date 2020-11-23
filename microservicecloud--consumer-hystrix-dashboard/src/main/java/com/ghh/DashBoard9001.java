package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: GuanHaoHao
 * @Description: 对所有服务进行健康，压力等进行监控
 * @Date: Create in 22:55 2020/11/23
 * @Modified By:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoard9001 {
    public static void main(String[] args) {
        SpringApplication.run(DashBoard9001.class, args);
    }
}
