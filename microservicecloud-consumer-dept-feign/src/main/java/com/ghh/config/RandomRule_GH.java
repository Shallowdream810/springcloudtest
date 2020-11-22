package com.ghh.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:56 2020/11/22
 * @Modified By:
 */

//继承AbstractLoadBalancerRule然后去github上拉下代码，之后去更改成自身的一个逻辑
public class RandomRule_GH extends AbstractLoadBalancerRule {


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {
        return null;
    }
}
