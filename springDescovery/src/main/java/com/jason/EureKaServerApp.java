package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jasonLu
 * @date 2017/5/11 20:24
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EureKaServerApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(EureKaServerApp.class,args);
    }
}
