package com.jason;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasonLu
 * @date 2017/5/11 20:40
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApp.class, args);

    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name)
    {
        return "hello " + name + ",xxxx from port" + port;
    }
}
