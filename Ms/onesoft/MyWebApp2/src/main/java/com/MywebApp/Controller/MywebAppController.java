
package com.MywebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.MywebApp.poojo.Emppoojo;



@RestController
@RequestMapping("/api2")
public class MywebAppController {
	@Autowired
	RestTemplate ma;
	
	@GetMapping("/getWord")
	public String getValue() {
		String url ="http://localhost:8080/webapp/get1";
		ResponseEntity<String> re = ma.exchange(url,HttpMethod.GET,null,String.class);
		return re.getBody();
	}
	
	@GetMapping("/geteven/{even}")
	public String geteven(@PathVariable int even) {
		String url = "http://localhost:8080/webapp/getEven/";
		ResponseEntity<String> eve= ma.exchange(url+even
				, HttpMethod.GET,null,String.class);
		return eve.getBody();
	}
	
	@GetMapping("/getanagram/{a}/{b}")
	public String getana(@PathVariable String a,@PathVariable String b) {
		String url ="http://localhost:8080/webapp/Anagram/";
		ResponseEntity<String> exchange = ma.exchange(url+a+"/"+b, HttpMethod.GET,null,String.class);
		return exchange.getBody();
	}
	
	@GetMapping("/emp")
	public List<Emppoojo> getMethodName() {
		String url = "http://localhost:8080/emp/getAll";
		ResponseEntity<List<Emppoojo>> emp = ma.exchange(url, HttpMethod.GET,null,new ParameterizedTypeReference<List<Emppoojo>>() {});
		return emp.getBody();
	}
	
	@GetMapping("/getId/{a}")
	public Emppoojo getMethodName(@PathVariable int a) {
		String url = "http://localhost:8080/emp/getById/";
		ResponseEntity<Emppoojo> em=ma.exchange(url+a, 
				HttpMethod.GET,null,new ParameterizedTypeReference<Emppoojo>() {});
		return em.getBody();
	}
	
	@GetMapping("/even/{b}")
	public String even(@PathVariable int b) {
		String url1="http://localhost:8080/webapp/getEven/";
		ResponseEntity<String> exchange = ma.exchange(url1+b, HttpMethod.GET,null,String.class);
		return exchange.getBody();
	}
	
	
	
}
