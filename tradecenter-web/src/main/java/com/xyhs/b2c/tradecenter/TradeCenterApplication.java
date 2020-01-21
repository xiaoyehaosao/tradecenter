package com.xyhs.b2c.tradecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ljp
 * @apiNote
 * @date 15:07 2019/11/13
 **/
@SpringCloudApplication
@EnableFeignClients
public class TradeCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeCenterApplication.class,args);
    }
}
