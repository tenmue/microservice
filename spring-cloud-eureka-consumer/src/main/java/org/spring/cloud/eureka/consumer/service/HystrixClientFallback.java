package org.spring.cloud.eureka.consumer.service;

import org.springframework.stereotype.Component;

/**
 * 熔断降级
 * @author USER
 *
 */
@Component
public class HystrixClientFallback implements DcService{

	@Override
	public String consumer(String params) {
		return "FeignClient Hystrix fallback:" + params;
	}

}
