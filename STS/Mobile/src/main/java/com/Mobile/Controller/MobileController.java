package com.Mobile.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mobile.Model.Mobile;
import com.Mobile.Service.MobileService;
import com.Mobile.exception.BrandNotFoundException;
import com.Mobile.exception.ColorNotFoundException;
import com.Mobile.exception.ModelStartsWithException;
import com.Mobile.exception.StorageCapacityException;
import com.Mobile.exception.YearNotFoundException;


@RestController
	@RequestMapping("/mobiles")
	public class MobileController {

	    @Autowired
	    private MobileService mobileService;

	    // POST - Create a new mobile
	    @PostMapping
	    public Mobile createMobile(@RequestBody Mobile mobile) {
	        return mobileService.saveMobile(mobile);
	    }

	    // GET - Retrieve all mobiles
	    @GetMapping
	    public List<Mobile> getAllMobiles() {
	        return mobileService.getAllMobiles();
	    }

	    // GET - Retrieve a single mobile by ID
	    @GetMapping("/{id}")
	    public Mobile getMobileById(@PathVariable int id) {
	        return mobileService.getMobileById(id);
	    }

	    // PUT - Update a mobile
	    @PutMapping("/{id}")
	    public Mobile updateMobile(@PathVariable int id, @RequestBody Mobile mobile) {
	        return mobileService.updateMobile(id, mobile);
	    }

	    // DELETE - Delete a mobile by ID
	    @DeleteMapping("/{id}")
	    public String deleteMobile(@PathVariable int id) {
	        mobileService.deleteMobile(id);
	        return "Mobile deleted successfully";
	    }
	    
	  //get by brand
	    @GetMapping(value="/getbybrand/{s}")
	    public List<Mobile> getByBrand(@PathVariable String s) throws BrandNotFoundException {
	    	
	    	return mobileService.getByBrand(s);
	    }
	    
	  //get by year
	    @GetMapping(value="/getbyyear/{year}")
	    public List<Mobile> getbyyear(@PathVariable int year) throws YearNotFoundException {
	    	
	    	return mobileService.getByYear(year);
	    }
	    
	  //get by color
	    @GetMapping(value="/getbycolor/{s}")
	    public List<Mobile> getByColor(@PathVariable String s) throws ColorNotFoundException  {
	    	return mobileService.getByColor(s);
	    }
	    
	  //get by model starts with
	    @GetMapping(value="/getbymodelstartwith/{s}")
	    public List<Mobile> getstartwith(@PathVariable String s) throws ModelStartsWithException {
	    	
	    	return mobileService.getStartWith(s);
	    }
	  //get Storage more than 64 and return other values 
	    @GetMapping(value="/getcapacitymorethan64/{a}/{b}")
	    public List<Mobile> getcapacitymorethan64(@PathVariable int a,@PathVariable int b) throws StorageCapacityException {
	    	
	    	return mobileService.getcapacitymorethan64(a,b);
	    }
	    
	    //get by brand
	    @GetMapping("/getbybrands/{brand}")
	    public List<Mobile> getByBrands(@PathVariable String brand) {
	    	return mobileService.getByBrands(brand);
	    }
	    
	    
}
