package com.core.controller;

import com.core.model.Employee;
import com.core.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }
    @PostMapping("/savedata")
    public  Employee saveData(@RequestBody Employee employee){

        log.info("*******trying to save data********"+employee.getEmpName());
        return employeeServiceImpl.saveData(employee);

    }
    @PutMapping("/updatedata/{empId}")
    public Employee updateData(@PathVariable int empId, @RequestBody Employee employees){
        return employeeServiceImpl.updateData(employees);
    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public void deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteByEmpId(empId);
    }


}
