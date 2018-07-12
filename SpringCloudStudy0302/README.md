# SpringCloudStudy0302

#### 项目介绍

1. 根据SpringCloudStudy0301的一个示例，product提供服务，mall消费服务
2. 主要教程可以参考CD826的SpringCloud入门教程(三):[https://www.jianshu.com/p/a0d50385e598](https://www.jianshu.com/p/a0d50385e598)
3. 感谢TransientBa的SpringBoot引用Eureka导致返回结果由json变为xml解决方案:[https://blog.csdn.net/zyb2017/article/details/80265070](https://blog.csdn.net/zyb2017/article/details/80265070)
4. 感谢每天多帅一点点的Feign PathVariable annotation was empty on param 0:[https://www.cnblogs.com/huhuixin/p/7797850.html](https://www.cnblogs.com/huhuixin/p/7797850.html)

##### Eureka默认返回的是Xml，修改为Json

在方法上加上这个声明就会返回Json，在类上加就整个类都是返回Json
````Java
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
````

##### 在Feign接口中的Controller方法@PathVariable前要加上Value，不会自动对应，例如@PathVariable("code")

````Java
package com.wang.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient("product-service")
@RequestMapping("/product")
public interface MallFeignService {
    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Object selectByCode(@PathVariable("code") String code);
}

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
