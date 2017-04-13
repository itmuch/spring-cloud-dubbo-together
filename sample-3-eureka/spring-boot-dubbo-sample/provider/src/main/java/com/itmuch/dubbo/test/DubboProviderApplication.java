package com.itmuch.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DubboProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(DubboProviderApplication.class, args);
  }
}
