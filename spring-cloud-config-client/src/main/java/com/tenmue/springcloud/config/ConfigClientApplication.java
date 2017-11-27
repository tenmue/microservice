package com.tenmue.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置中心客户端
 * @author USER
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientApplication {
	
	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping("/")
    public String home() {
        return "application server port is:" + serverPort;
    }

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
