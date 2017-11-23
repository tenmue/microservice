package org.spring.cloud.eureka.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client", fallback = HystrixClientFallback.class)
public interface DcService {

	@GetMapping("/dc")
    String consumer(@RequestParam("params") String params);
}
