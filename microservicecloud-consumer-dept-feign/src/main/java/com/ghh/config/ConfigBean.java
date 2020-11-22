package com.ghh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 23:12 2020/11/18
 * @Modified By:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //springcloud ribbon提供给客户端的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
