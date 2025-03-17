package com.StudentResults;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentResultsService {
@Autowired
StudentResultsDao sd;

	public Results saveStudentResult( ) {
        return sd.saveStudentResult();
    }

    
    public Results getTopper() {
        return sd.getTopper();
    }

    
    public List<Results> getTopThreeRankers() {
        return sd.getTopThreeRankers();
    }

    
    public List<Results> getStudentsByMarksRange( int min,  int max) {
        return sd.getStudentsByMarksRange(min, max);
    }
}
