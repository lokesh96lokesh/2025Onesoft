package com.KafKaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/producer")
public class ProducerController {
	@Autowired
	KafKaProducer kp;
	
	@GetMapping("/send/{word}")
	public String sendThis(@PathVariable String word) {
		kp.sendMessage(word);
		return word +"msg sent";
	}
}
