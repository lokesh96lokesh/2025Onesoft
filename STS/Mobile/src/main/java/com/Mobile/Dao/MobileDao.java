package com.Mobile.Dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Mobile.Model.Mobile;
import com.Mobile.Repository.MobileRepository;
import com.Mobile.exception.ModelStartsWithException;
import com.Mobile.exception.StorageCapacityException;
import com.Mobile.exception.YearNotFoundException;

@Repository
public class MobileDao {
	@Autowired
    private MobileRepository mobileRepository;

    // Save a mobile
    public Mobile saveMobile(Mobile mobile) {
        return mobileRepository.save(mobile);
    }

    // Get all mobiles
    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }

    // Get mobile by ID
    public Optional<Mobile> getMobileById(int id) {
        return mobileRepository.findById(id);
    }

    // Update a mobile
    public Mobile updateMobile(int id, Mobile mobile) {
        Optional<Mobile> existingMobile = mobileRepository.findById(id);
        if (existingMobile.isPresent()) {
            Mobile updatedMobile = existingMobile.get();
            updatedMobile.setBrand(mobile.getBrand());
            updatedMobile.setModel(mobile.getModel());
            updatedMobile.setPrice(mobile.getPrice());
            updatedMobile.setColour(mobile.getColour());
            updatedMobile.setStorage(mobile.getStorage());
            updatedMobile.setYear(mobile.getYear());
            return mobileRepository.save(updatedMobile);
        }
        return null;
    }

    // Delete a mobile
    public void deleteMobile(int id) {
        mobileRepository.deleteById(id);
    }
    
    public List<Mobile> getByBrand( String s) {
    	
    	return mobileRepository.getByBrand(s);
    }
    
    public List<Mobile> getbyyear( int year) throws YearNotFoundException {
    	
    	return mobileRepository.getbyyear(year);
    }
    
public List<Mobile> getByColor( String s) {
    	
    	return mobileRepository.getByColor(s);
    }
public List<Mobile> getstartwith( String s) throws ModelStartsWithException {
	
	return mobileRepository.getstartwith(s);
}
public List<Mobile> getcapacitymorethan64( int a,int b) throws StorageCapacityException {
	
	return mobileRepository.getcapacitymorethan64( a, b);
}
	

}
