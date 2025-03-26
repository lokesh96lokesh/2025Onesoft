package com.example.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Electronics.Entity.Mobile;
import com.example.Electronics.Exception.BrandNotFoundException;
import com.example.Electronics.Exception.ColorNotfoundException;
import com.example.Electronics.Exception.PriceHighException;
import com.example.Electronics.Exception.StartsWithException;
import com.example.Electronics.Exception.StrorageCapacityException;
import com.example.Electronics.Exception.YearException;
import com.example.Electronics.Exception.YearNotFoundException;
import com.example.Electronics.Service.MobileService;



@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	MobileService ms;
	
	@PostMapping("/postAll")
	public String postMethodName(@RequestBody List<Mobile> m) {
		return ms.postmethod(m);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getMethodName() {
		return ms.getmethodname();
	}
	//brand not available exception
	@GetMapping("/getBymobilebrand/{s}")
	public List<Mobile> getBybrand(@PathVariable String s) throws BrandNotFoundException{
		return ms.getbrand(s);
	}
	//year notfound exception
	@GetMapping("/getyear/{s1}/{s2}")
	public List<Mobile> getByyear(@PathVariable int s1,@PathVariable int s2) throws  YearNotFoundException{
		return ms.getByyear(s1,s2);
	}
	
	//color not found 
	@GetMapping("/getcolor/{s}")
	public List<Mobile> getBycolor(@PathVariable String s) throws ColorNotfoundException{
		return ms.getBycolor(s);
	}
	
	//brand StartWith
	@GetMapping("/startWith/{s}")
	public List<Mobile> getbrandStart(@PathVariable String s) throws StartsWithException {
		return ms.getbrandStart(s);
	}
	
	//getStorage
	@GetMapping("/storage/{a}/{b}")
	public List<Mobile> getstorage(@PathVariable int a,@PathVariable int b) throws StrorageCapacityException{
		return ms.getstorage(a,b);
	}
	
	@PostMapping("/postPrice")
	public String postPrice(@RequestBody Mobile p) throws PriceHighException{
		return ms.postPrice(p);
	}
	
	
	//getyear
	@GetMapping("/year/{a}")
	public List<Mobile> year(@PathVariable int a) throws YearException {
		return ms.year(a);
	}
	
	
}



