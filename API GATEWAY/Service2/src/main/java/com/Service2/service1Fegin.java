package com.Service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="SERVICE1")
public interface service1Fegin {
	@GetMapping(value="/get")
	public String getmessage();
	

}
