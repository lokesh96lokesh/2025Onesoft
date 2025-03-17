package com.example.Electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Electronics.Dao.MobileDao;
import com.example.Electronics.Entity.Mobile;
import com.example.Electronics.Exception.BrandNotFoundException;
import com.example.Electronics.Exception.ColorNotfoundException;
import com.example.Electronics.Exception.PriceHighException;
import com.example.Electronics.Exception.StartsWithException;
import com.example.Electronics.Exception.StrorageCapacityException;
import com.example.Electronics.Exception.YearNotFoundException;

@Service
public class MobileService {

	@Autowired
	MobileDao md;
	

	public String postmethod(List<Mobile> m) {
		return md.postmethod(m);
	}

	public List<Mobile> getmethodname() {
		return md.getmethodname();
	}

	public List<Mobile> getbrand(String s) throws BrandNotFoundException{
		if(md.getbrand(s).isEmpty()) {
			throw new BrandNotFoundException("Brand Not Found Exception");
		}else {
		return md.getbrand(s);
		}
		 
	}

	public List<Mobile> getByyear(int s1,int s2)throws YearNotFoundException {
		if (md.getByyear(s1,s2).isEmpty()) { 
	        throw new YearNotFoundException("Mobile year not found Exception");
	    }else {
		return md.getByyear(s1,s2);
	    }
	}

	public List<Mobile> getBycolor(String s)throws ColorNotfoundException {
		if(md.getBycolor(s).isEmpty())
			throw new ColorNotfoundException("Color is not found plz select valid colors");
		else
			return md.getBycolor(s);
	}

	public List<Mobile> getbrandStart(String s) throws StartsWithException{
		if(md.getbrandStart(s).isEmpty()) {
			throw new StartsWithException("there is no brand start with "+s+" letter");
		}
		else
			return md.getbrandStart(s);
	}

	public List<Mobile> getstorage(int a, int b)throws StrorageCapacityException {
		if(md.getstorage(a,b).isEmpty())
			throw new StrorageCapacityException("there is no that type of storage");
		else
		return md.getstorage(a,b);
	}

	public String postPrice(Mobile p) throws PriceHighException{
		if(p.getPrice()>8000) {
			throw new PriceHighException("price is high exception");
		}
		else
			return md.postPrice(p);
	}
}


