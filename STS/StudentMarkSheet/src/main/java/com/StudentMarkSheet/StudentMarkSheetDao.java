package com.StudentMarkSheet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentMarkSheetDao {
	@Autowired
    StudentMarkSheetRepository sr;

    public MarkSheet saveMarkSheet(MarkSheet m) {
        m.setSem1Total(m.getSem1Theory() + m.getSem1Practicals());
        m.setSem2Total(m.getSem2Theory() + m.getSem2Practicals());
        return sr.save(m);
    }
    public List<MarkSheet> getAllMarkSheets() {
        return sr.findAll();
    }
    
  

}
