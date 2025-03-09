package com.Employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Employee.Model.EmployeeModel;
import com.Employee.service.EmployeeService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Map;


@RestController
@RequestMapping(value="/emp")
public class EmployeeController {
@Autowired
EmployeeService es;
	
    //Add a new Employee
    @PostMapping(value="/add")
    public String addEmployee(@RequestBody EmployeeModel e) {
    	
    	return es.addEmployee(e);
    }
    
  //Add a list new Employee
    @PostMapping(value="/addlist")
    public String addmoreEmployee(@RequestBody List<EmployeeModel> e) {
    	
    	return es.addmoreEmployee(e);
    }
    
  //get a list new Employee
    @GetMapping(value="/alllist")
    public List<EmployeeModel> GetEmployee() {
    	
    	return es.GetEmployee();
    }
    
  //get by id Employee
    @GetMapping(value="/getbyid/{id}")
    public EmployeeModel GetEmployeebyid(@PathVariable int id) {
    	
    	return es.GetEmployeebyid(id);
    }
    
  //get by id Employee
    @DeleteMapping(value="/deletebyid/{id}")
    public String dltEmployeebyid(@PathVariable int id) {
    	
    	return es.dltEmployeebyid(id);
    }
   
  //update by id Employee
    @PutMapping(value="/updatebyid/{id}")
    public String updatebyid(@PathVariable int id,@RequestBody EmployeeModel e ) {
    	
    	return es.updatebyid(id,e);
    }
    
  //update by id Employee
    @PatchMapping(value="/updatebyid1/{id}")
    public String updatebyid1(@PathVariable int id,@RequestBody EmployeeModel e ) {
    	
    	return es.updatebyid1(id,e);
    }
    //DateConverter
    @GetMapping("/{day}/{month}/{year}")
    public String convertDate(@PathVariable String day, @PathVariable String month, @PathVariable String year) {
        String input = day + " " + month + "," + year;
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd MMMM,yyyy", Locale.ENGLISH);
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(input, inputFormat);
        return date.format(outputFormat);
    }
    //CharacterCount
    @GetMapping("/{input}")
    public String findCharacterCounts(@PathVariable String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
    
    //Frequency
    @GetMapping("/count/{input}")
    public String getCharacterFrequency(@PathVariable String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
