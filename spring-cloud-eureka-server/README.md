# Spring Cloud

* ## 高可用服务注册与发现【Eureka】

* ### 主启动类Application

```
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
```
* ### application.properties或application.yml配置文件

```
spring.application.name=eureka-server
server.port=1001
eureka.instance.hostname=localhost
#是否注册自己，在集群环境下设置为true
#eureka.client.register-with-eureka=false
#否从eureka服务器获取注册信息，在集群环境下设置为true
#eureka.client.fetch-registry=false
#配置高可用注册中心，另外一台注册中心地址
eureka.client.serviceUrl.defaultZone=http://localhost:1002/eureka/
```
或

```
spring:
  application:
    name: eureka-server2

server:
  port: 1002

eureka:
  instance:
    hostname: localhost
  client:
    #是否注册自己，在集群环境下设置为true
    #register-with-eureka: false
    #否从eureka服务器获取注册信息，在集群环境下设置为true
    #fetch-registry: false
    serviceUrl:
      ##配置高可用注册中心，另外一台注册中心地址
      defaultZone: http://localhost:1001/eureka/
```