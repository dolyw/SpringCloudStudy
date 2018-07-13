# SpringCloudStudy0401

#### 项目介绍

1. 接SpringCloudStudy0301新增service-ribbon服务
2. 为service-ribbon，service-feign添加Hystrix容错和监控
3. 创建一个hystrix-dashboard监控仪表盘
4. 主要教程可以参考方志朋的史上最简单的SpringCloud教程 | 第四篇:[https://blog.csdn.net/forezp/article/details/69934399](https://blog.csdn.net/forezp/article/details/69934399)
5. 感谢CD826的SpringCloud入门教程(四):[https://www.jianshu.com/p/57906ee8d506](https://www.jianshu.com/p/57906ee8d506)
6. 感谢ddxd0406的SpringBoot2.0下Hystrix Dashboard Unable to connect to Command Metric Stream解决办法:[https://blog.csdn.net/ddxd0406/article/details/79643059](https://blog.csdn.net/ddxd0406/article/details/79643059)

##### SpringBoot2.0下Hystrix监控访问出现问题
需要在监控的项目下加上如下配置，然后监控地址从/hystrix.stream变成/actuator/hystrix.stream
````yml
# Hystrix监控
management:
  endpoints:
    web:
      exposure:
        include: "*"
````

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
