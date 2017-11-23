package org.spring.cloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务消费方(基于Feign实现)
 * @author USER
 *
 */
@SpringCloudApplication
//开启扫描Feign客户端的功能
@EnableFeignClients
public class EurekaConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
