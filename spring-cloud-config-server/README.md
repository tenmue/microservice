# Spring Config Server高可用

## 注册为服务

将config-server注册为服务，即将配置中心服务注册到注册中心，这样所有的客户端就能以服务的形式访问到。通过这种方法，只需要启动多个指向同一Git仓库位置的config-server就能实现高可用了。

## config-server

* application.yml文件配置如下：

```
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/tenmue/config-center.git

server:
  port: 1201

eureka:
  client:
    service-url:
      defaultZone: http://localhost:1002/eureka/
```

* Application主类，新增@EnableDiscoveryClient注解，用来将config-server注册到配置的服务注册中心上去。

## config-client

* bootstrap.yml文件配置如下：

```
spring:
  application:
    #文件名称
    name: config-client-dev
  cloud:
    config:
      discovery:
        #开启通过服务来访问Config Server的功能
        enabled: true
        #参数来指定Config Server注册的服务名，注意大小写区分
        service-id: CONFIG-SERVER
      profile: dev
      
eureka:
  client:
    service-url:
      defaultZone: http://localhost:1002/eureka/
```

* Application主类，新增@EnableDiscoveryClient注解，用来发现config-server服务，利用其来加载应用配置