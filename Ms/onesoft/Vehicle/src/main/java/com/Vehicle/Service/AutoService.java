package com.Vehicle.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.Vehicle.Dao.AutoDao;
import com.Vehicle.Model.Auto;


@Service
public class AutoService {
	@Autowired
	AutoDao ad;
	
	public String postAll(@RequestBody List<Auto> A) {
		return ad.postAll(A);
	}
	
	public List<Auto> getvalue() {
		return ad.getvalue();
	}
	
	 // Get Auto prices greater than a given value
    public List<Integer> getByPrice(int a) {
        return ad.getByPriceGreaterThan(a)
                      .stream()
                      .map(Auto::getPrice)
                      .toList();
    }

    // Get distinct Auto details
    public List<Auto> getDistinctDetails() {
        return ad.getDistinctDetails();
    }

    // Get max price of Auto
    public Integer getMaxPrice() {
        return ad.getMaxPrice();
    }

    // Get the Auto object with the minimum price
    public Auto getMinObject() {
        return ad.getMinPriceAuto()
                .orElseThrow(() -> new RuntimeException("No cars available"));
    }

}
