package com.Api2;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value="/SecondaryApi")
public class Api2Controller {
	@Autowired
	RestTemplate rt;
	@GetMapping(value= "/getword/getword")
	public String getValue() {
		String url= "http://localhost:8080/webapp/getEven/{even}";
		ResponseEntity<String>re=rt.exchange(url, HttpMethod.GET,null,String.class);
		String x= re.getBody();
		return x;
	}
	
	@GetMapping(value= "/oddeven/{even}")
	public String getValue1(@PathVariable int even) {
		String url= "http://localhost:8080/webapp/getEven/";
		ResponseEntity<String>re=rt.exchange(url+even, HttpMethod.GET,null,String.class);
		String x= re.getBody();
		return x;
	}
	
	@GetMapping(value= "/getallempdetails")
	public List<Employee> getValue2() {
		String url= "http://localhost:8080/emp/alllist";
		ResponseEntity<List<Employee>>re=rt.exchange(url, HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>() {});
		List<Employee> x= re.getBody();
		return x;
	}
	
	@GetMapping(value= "/getbyid/{id}")
	public Employee getValue3(@PathVariable int id) {
		String url= "http://localhost:8080/emp/getbyid/";
		ResponseEntity<Employee>re=rt.exchange(url+id, HttpMethod.GET,null,Employee.class);
		//String x= re.getBody();
		return re.getBody();
	}
	
	//get gst with persentage added with netprice
	@GetMapping(value= "/getAllProductWithGst")
	public List<Product> getValue4() {
		String url2= "http://localhost:8081/GST/getPercentageHsn/";
		String url1= "http://localhost:8082/product/getAll";
		ResponseEntity<List<Product>>re1=rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<Product>>() {});
		List<Product> products = re1.getBody();
		products.forEach(x -> {
			int hsn=x.getHsncode();
			ResponseEntity<Integer>re2=rt.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			int percent=re2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*percent/100));
		});
		return products;
	}
	}

