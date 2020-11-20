package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:35 2020/11/18
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
