package com.Mobile.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.Mobile.Dao.MobileDao;
import com.Mobile.Model.Mobile;
import com.Mobile.exception.BrandNotFoundException;
import com.Mobile.exception.ColorNotFoundException;
import com.Mobile.exception.ModelStartsWithException;
import com.Mobile.exception.StorageCapacityException;
import com.Mobile.exception.YearNotFoundException;

@Service
public class MobileService {
	@Autowired
    private MobileDao mobiledao; 

    
    public Mobile saveMobile(Mobile mobile) {
        return mobiledao.saveMobile(mobile);
    }


	public List<Mobile> getAllMobiles() {
        return mobiledao.getAllMobiles();
    }

    
    public Mobile getMobileById(int id) {
        return mobiledao.getMobileById(id).orElse(null);
    }

    
    public Mobile updateMobile( int id,  Mobile mobile) {
        return mobiledao.updateMobile(id, mobile);
    }

    
    public void deleteMobile(int id) {
    	mobiledao.deleteMobile(id);
    }
    
    public List<Mobile> getByBrand(String s) throws BrandNotFoundException {
      
        if (mobiledao.getByBrand(s).isEmpty()) {
            throw new BrandNotFoundException("No brand available");
        }
        else {
        return mobiledao.getByBrand(s);
        }
    }
    
    public List<Mobile> getByYear(@PathVariable int year) throws YearNotFoundException {
        List<Mobile> mobiles = mobiledao.getbyyear(year);
        
        if (mobiles == null || mobiles.isEmpty()) {
            throw new YearNotFoundException("No brand available for the given year");
        }
        
        return mobiles;
    }
    
    

    public List<Mobile> getByColor(String s) throws ColorNotFoundException {
        
        if (mobiledao.getByColor(s).isEmpty()) {
            throw new ColorNotFoundException("No color available");
        }
        else {
        return mobiledao.getByColor(s);
        }
    }
    
    public List<Mobile> getStartWith(String s) throws ModelStartsWithException {
        List<Mobile> mobiles = mobiledao.getstartwith(s);

        if (mobiles == null || mobiles.isEmpty()) {
            throw new ModelStartsWithException("No Model available with the given prefix");
        }
        return mobiles;
    }
    
    public List<Mobile> getcapacitymorethan64( int a,int b) throws StorageCapacityException {
    	List<Mobile> mobiles = mobiledao.getcapacitymorethan64( a, b);

        if (mobiles == null || mobiles.isEmpty()) {
            throw new StorageCapacityException("No Model available with the given Storage");
        }
        return mobiledao.getcapacitymorethan64(a,b);
    }
}
