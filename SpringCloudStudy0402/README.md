# SpringCloudStudy0402

#### 项目介绍

1. 根据SpringCloudStudy0401的一个示例
2. 主要教程可以参考方志朋的史上最简单的SpringCloud教程 | 第四篇:[https://blog.csdn.net/forezp/article/details/69934399](https://blog.csdn.net/forezp/article/details/69934399)
3. 感谢CD826的SpringCloud入门教程(四):[https://www.jianshu.com/p/57906ee8d506](https://www.jianshu.com/p/57906ee8d506)

##### 在类名上@FeignClient使用fallback和@RequestMapping一起使用报错
如下报错
````Java
@FeignClient(value = "product-service", fallback = MallFeignServiceHystrixImpl.class)
@RequestMapping("/product")
````
不使用fallback，这样没问题
````Java
@FeignClient("product-service")
@RequestMapping("/product")
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
