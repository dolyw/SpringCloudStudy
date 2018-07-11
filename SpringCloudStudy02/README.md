# SpringCloudStudy02

#### 项目介绍

1. 接SpringCloudStudy01继续创建一个服务消费者，进行负载均衡消费
2. 主要教程可以参考方志朋的史上最简单的SpringCloud教程|第二篇:[https://blog.csdn.net/forezp/article/details/69788938](https://blog.csdn.net/forezp/article/details/69788938)
3. 如何在IDEA启动多个Spring Boot工程实例:[https://blog.csdn.net/forezp/article/details/76408139](https://blog.csdn.net/forezp/article/details/76408139)
4. 感谢CD826的SpringCloud入门教程(二):[https://www.jianshu.com/p/df9393755a05](https://www.jianshu.com/p/df9393755a05)
5. RestTemplate使用指南:[https://www.jianshu.com/p/462790156554](https://www.jianshu.com/p/462790156554)
6. 感谢从删库到跑路的Eureka的自我保护模式:[https://blog.csdn.net/cvntopuyef/article/details/78477681](https://blog.csdn.net/cvntopuyef/article/details/78477681)
7. Eureka客户端服务端配置:[https://blog.csdn.net/cvntopuyef/article/details/78477724](https://blog.csdn.net/cvntopuyef/article/details/78477724)

###### 剔除过期等不健康实例配置(生产环境不建议使用)

Server端
````
#1.关闭注册中心自我保护机制
eureka.server.enable-self-preservation：false
#2.注册中心清理间隔（单位毫秒，默认60*1000）
eureka.server.eviction-interval-timer-in-ms：10000
````

Client端
````
#1.开启健康检查（需要spring-boot-starter-actuator依赖）
eureka.client.healthcheck.enabled:true
#2.租期更新时间间隔（默认30秒）
eureka.instance.lease-renewal-interval-in-seconds=10
#3.租期到期时间（默认90秒）
eureka.instance.lease-expiration-duration-in-seconds=15
````

以上参数配置下来，从服务停止，到注册中心清除不健康实例，时间大约在30秒左右。租期到期时间为30秒时，清除时间大约在59秒，若采用默认的30-60配置，清除时间大约在2分半(以上均在关闭保护机制情况下)，生产环境建议采用默认配置，服务停止到注册中心清除实例之间有一些计算什么的

#### 软件架构

1. xxxx

#### 安装教程

1. xxxx

#### 使用说明

1. xxxx

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request
