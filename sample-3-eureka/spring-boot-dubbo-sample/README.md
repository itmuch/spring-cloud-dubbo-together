# README

该例是一个Spring Boot整合Dubbo的Demo，

| module名称                  | 作用                        |
| ------------------------- | ------------------------- |
| api                       | dubbo接口                   |
| consumer                  | 服务消费者                     |
| provider                  | 服务提供者                     |
| spring-boot-starter-dubbo | Spring Boot的Dubbo Starter |

spring-boot-starter-dubbo来自[https://github.com/teaey/spring-boot-starter-dubbo](https://github.com/teaey/spring-boot-starter-dubbo) ，中央仓库里没有，索性引入过来了。
对原先程序略有修改，主要是因为原先版本用的Spring Boot版本较低，由于侵入原先代码，故而提一下。生产中，建议使用Maven的exclude排除老的依赖。

写得比较简单粗糙，详见代码。

