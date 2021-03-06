package com.ghh;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:35 2020/11/18
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
//自定义配值自己所
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
