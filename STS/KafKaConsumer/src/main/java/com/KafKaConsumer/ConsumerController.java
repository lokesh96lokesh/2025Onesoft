package com.KafKaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	@Autowired
	KafkaConsumer kc;
	
	@GetMapping("/get")
	public String getAllMsg() {
		return kc.getAllMsg();
	}

}
