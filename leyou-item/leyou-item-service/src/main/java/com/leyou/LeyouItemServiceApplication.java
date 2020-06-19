package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ZhaoYR
 * 2020/6/17 17:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemServiceApplication.class,args);
    }
}
