package com.myrule;

import com.ghh.config.RandomRule_GH;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: GuanHaoHao
 * @Description: 自定义ribbon的规则，不能够放到主启动类的包以及其子包中
 * @Date: Create in 20:40 2020/11/22
 * @Modified By:
 */
@Configuration
public class MySelfRule  {


    @Bean
    public IRule myRule(){

        //自身自己定义的一个设置模式
//        return new RandomRule_GH();

        return new RandomRule();
    }

}
