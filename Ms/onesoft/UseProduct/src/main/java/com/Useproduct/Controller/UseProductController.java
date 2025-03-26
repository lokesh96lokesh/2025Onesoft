package com.Useproduct.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Useproduct.poojo.ProductPoojo;

@RestController
@RequestMapping("/UseProduct")
public class UseProductController {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getAllproductwithGst") 
	public List<ProductPoojo> getAlproduct(){
		String url1 = "http://localhost:8080/product/getAll";
		String url2 = "http://localhost:8081/GST/getPercentageHsn/";//if we pass hsn we got percentage
		ResponseEntity<List<ProductPoojo>> res1 = rt.exchange(url1, HttpMethod.GET,null,
				new ParameterizedTypeReference<List<ProductPoojo>>() {
				});
		List<ProductPoojo> products = res1.getBody();
		products.forEach(x->{
			int hsn = x.getHSNcode();
			 ResponseEntity<Integer> res2 = rt.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			Integer percentage = res2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*percentage/100));
		});
		return products;
	}
	
	
	
	@GetMapping("/getproduct")
	public List<ProductPoojo> getMethodName() {
		String url1 = "http://localhost:8080/product/getAll";
		String url2 = "http://localhost:8081/GST/getPercentageHsn/";
		ResponseEntity<List<ProductPoojo>> exchange = rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<ProductPoojo>>() {});
		List<ProductPoojo> body = exchange.getBody();
		body.forEach(x->{
			int hsn = x.getHSNcode();
			ResponseEntity<Integer> exchange2 = rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
			Integer body2 = exchange2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*body2/100));
		});
		return body;
	}
	
}
