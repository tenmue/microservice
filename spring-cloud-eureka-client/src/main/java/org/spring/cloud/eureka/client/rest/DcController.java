package org.spring.cloud.eureka.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务接口
 * @author USER
 *
 */
@RestController
public class DcController {

	@GetMapping("/dc")
    public String dc(@RequestParam("params") String param) {
        System.out.println(param);
        return "参数值为：" + param;
    }
}
