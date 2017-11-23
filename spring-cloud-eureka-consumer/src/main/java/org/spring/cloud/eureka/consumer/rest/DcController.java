package org.spring.cloud.eureka.consumer.rest;

import org.spring.cloud.eureka.consumer.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

	@Autowired
	DcService dcClient;

	@GetMapping("/consumer")
	public String dc() {
		
		return dcClient.consumer("【服务消费" + Thread.currentThread() + "】");
	}
}
