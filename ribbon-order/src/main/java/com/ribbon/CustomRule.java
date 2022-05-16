package com.ribbon;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author 黄小爷
 * @description
 */
@Configuration
public class CustomRule extends AbstractLoadBalancerRule {
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }

    public Server choose(Object key) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> servers = loadBalancer.getReachableServers();
        int random=ThreadLocalRandom.current().nextInt(servers.size());
        return servers.get(random);
    }
}
