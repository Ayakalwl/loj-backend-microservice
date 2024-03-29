package com.lxy.lojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@MapperScan("com.lxy.lojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.lxy")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.lxy.lojbackendserviceclient.service"})
public class LojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojBackendUserServiceApplication.class, args);
    }

}
