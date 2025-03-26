package com.Feign.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/feign")
public class Mycontroller {
	@Autowired
	Feign f;
	
	@Autowired
	FeignEmployee fe;
	@GetMapping("/showvalue")
	public String getvalue() {
		return f.getWord();
	}
	
	@GetMapping("/resultofname/{m}")
	public String getname(@PathVariable String m) {
		return f.getName(m);
	}
	
	@GetMapping("/resultgetshirt")
	public String getShirt(@RequestBody ShirtPojo ss) {
		return ss.getBrand();
	}
	
	@GetMapping("/getempall")
	public List<Employeepojo> getAllemp() {
		return fe.getall();
	}
	
	@GetMapping("/getbyId/{a}")
	public Employeepojo getvaluebyid(@PathVariable int a) {
		return fe.getvalue(a);
	}
	
	@GetMapping("/deletebyid/{a}")
	public String getdelete(@PathVariable int a) {
		return fe.deletebyid(a);
	}
	
	@PutMapping("/update/{a}")
	public String putsingleobj(@PathVariable int a, @RequestBody Employeepojo ep) {
		return fe.putsingle(a, ep);
	}
	
	@PatchMapping("/patchpo/{a}")
	public String patchsingle(@PathVariable int a,@RequestBody Employeepojo e) {
		return fe.patch(a, e);
	}
}
