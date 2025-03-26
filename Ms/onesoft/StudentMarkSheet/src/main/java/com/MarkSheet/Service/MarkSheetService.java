package com.MarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarkSheet.Dao.MarksheetDao;
import com.MarkSheet.Entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarksheetDao d;
	
	/*The JSON format from the Postman should not have 
	  the input for sem1Total and sem2Total. 
	  The StudentMarkSheet sem1Total must be the total of 
	  sem1Theory and sem1Practicals and sem2Total must be the total of
	  sem2Theory and sem2Practicals, this should be done during 
	  the post method inside service class implementations.*/

	public String postMethod(List<MarkSheet> m) {
		for(MarkSheet ms:m) {
			ms.setSem1Total(ms.getSem1Theory()+ms.getSem1Practicals());
			ms.setSem2Total(ms.getSem2Theory()+ms.getSem2Practicals());
		}
		return d.postMethod(m);
	}

	public List<MarkSheet> getMethod() {
		return d.getMethod();
	}
}
