package com.Service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SERVICE2")
public interface service2Feign {
	@GetMapping(value="/get")
	public String getmessage();

}
