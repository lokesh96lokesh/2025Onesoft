package com.MyWebApp.Controller;

import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyWebApp.Entity.Shirt;

@RestController
@RequestMapping(value= "/shirt")
public class UseShirt {
	static Logger log = Logger.getLogger(UseShirt.class);
	static {
	    PropertyConfigurator.configure("log4j.properties");
	}

	        //http://localhost:8080/shirt/get
			@GetMapping(value = "/get")
			public List<Shirt> getShirt(@RequestBody List<Shirt> s) {
				log.info("get Shirt details: " + s);
				return s;
			}
			
			//http://localhost:8080/shirt/getminprice
			@GetMapping(value = "/getminprice")
				public  Shirt getminprice(@RequestBody List<Shirt> s) {
				
				Shirt minPriceShirt= s.stream()
			        		 .min(Comparator.comparing(Shirt::getPrice))
			        		 .get();
				log.info("get min Shirt details: " + minPriceShirt);
				return minPriceShirt;
			      
				}
			//http://localhost:8080/shirt/getmaxprice
			@GetMapping(value = "/getmaxprice")
				public  Shirt getmaxprice(@RequestBody List<Shirt> s) {
				
				Shirt maxPriceShirt= s.stream()
			        		 .max(Comparator.comparing(Shirt::getPrice))
			        		 .get();
				log.info("get max Shirt details: " + maxPriceShirt);
				return maxPriceShirt;
			      
				}

}
