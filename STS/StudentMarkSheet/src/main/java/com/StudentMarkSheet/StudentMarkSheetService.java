package com.StudentMarkSheet;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMarkSheetService {

	    @Autowired
	    StudentMarkSheetDao sd;

	    public MarkSheet saveMarkSheet(MarkSheet m) {
	        return sd.saveMarkSheet(m);
	    }
	    public List<MarkSheet> getAllMarkSheets() {
	        return sd.getAllMarkSheets();
	    }
	    public int getAllMarkSheets( int rollNo) {
	       int total= sd.getAllMarkSheets().stream().filter(x->x.getRollNumber()==rollNo).map(x->x.getSem1Total()+x.getSem2Total()).findAny().get();
	        return total;
	        
	    }
	}
