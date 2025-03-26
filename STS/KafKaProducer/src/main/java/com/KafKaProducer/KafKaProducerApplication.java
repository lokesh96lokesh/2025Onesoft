package com.KafKaProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
@EnableKafka
@SpringBootApplication
public class KafKaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafKaProducerApplication.class, args);
	}

}
