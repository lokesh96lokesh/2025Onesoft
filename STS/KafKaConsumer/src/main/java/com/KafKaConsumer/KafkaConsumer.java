package com.KafKaConsumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	List<String>result=new ArrayList<>();
	@KafkaListener(topics="${my.topic.name}",groupId="kafka_consumer1")
	
	public void reciveMessage(String msg) {
		addMessage(msg);	
	}
	public void addMessage(String m) {
		result.add(m);	
	}
	public String getAllMsg( ) {
		return result.toString();	
	}
}
