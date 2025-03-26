package com.Employee.controller;

import java.util.List;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
static Logger log = Logger.getLogger(EmployeeController.class);
static {
    PropertyConfigurator.configure("log4j.properties");
}

@PostMapping(value="/add")
public String addEmployee(@RequestBody EmployeeModel e) {
    log.info("Adding Employee: " + e);
    String result = es.addEmployee(e);
    log.info("Result: " + result);
    return result;
}

@PostMapping(value="/addlist")
public String addMoreEmployees(@RequestBody List<EmployeeModel> e) {
    log.info("Adding Employee List: " + e);
    String result = es.addmoreEmployee(e);
    log.info("Result: " + result);
    return result;
}

@GetMapping(value="/alllist")
public List<EmployeeModel> getAllEmployees() {
    log.info("Fetching all employees");
    List<EmployeeModel> employees = es.GetEmployee();
    log.info("Result: " + employees);
    return employees;
}

@GetMapping(value="/getbyid/{id}")
public EmployeeModel getEmployeeById(@PathVariable int id) {
    log.info("Fetching Employee by ID: " + id);
    EmployeeModel employee = es.GetEmployeebyid(id);
    log.info("Result: " + employee);
    return employee;
}

@DeleteMapping(value="/deletebyid/{id}")
public String deleteEmployeeById(@PathVariable int id) {
    log.info("Deleting Employee by ID: " + id);
    String result = es.dltEmployeebyid(id);
    log.info("Result: " + result);
    return result;
}

@PutMapping(value="/updatebyid/{id}")
public String updateEmployeeById(@PathVariable int id, @RequestBody EmployeeModel e) {
    log.info("Updating Employee by ID: " + id + " with Data: " + e);
    String result = es.updatebyid(id, e);
    log.info("Result: " + result);
    return result;
}

@PatchMapping(value="/updatebyid1/{id}")
public String partialUpdateEmployeeById(@PathVariable int id, @RequestBody EmployeeModel e) {
    log.info("Partially Updating Employee by ID: " + id + " with Data: " + e);
    String result = es.updatebyid1(id, e);
    log.info("Result: " + result);
    return result;
}

@GetMapping("/{day}/{month}/{year}")
public String convertDate(@PathVariable String day, @PathVariable String month, @PathVariable String year) {
    log.info("Converting Date: " + day + " " + month + " " + year);
    String input = day + " " + month + "," + year;
    DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd MMMM,yyyy", Locale.ENGLISH);
    DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date = LocalDate.parse(input, inputFormat);
    String formattedDate = date.format(outputFormat);
    log.info("Converted Date: " + formattedDate);
    return formattedDate;
}

@GetMapping("/charcount/{input}")
public String findCharacterCounts(@PathVariable String input) {
    log.info("Finding character counts for: " + input);
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (char c : input.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder result = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        result.append(entry.getKey()).append(entry.getValue());
    }
    log.info("Character Counts: " + result);
    return result.toString();
}

@GetMapping("/count/{input}")
public String getCharacterFrequency(@PathVariable String input) {
    log.info("Getting character frequency for: " + input);
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (char c : input.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder result = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        result.append(entry.getKey()).append(entry.getValue());
    }
    log.info("Character Frequency: " + result);
    return result.toString();
}
}
