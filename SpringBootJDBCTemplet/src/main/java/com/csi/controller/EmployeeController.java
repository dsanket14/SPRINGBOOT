package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }
    @PostMapping("/savedata")
    public String saveAllData(@RequestBody Employee employee){
        employeeServiceImpl.saveAllData(employee);
        return "data saved successfully";
    }
    @PutMapping("/updatedata/{empId}")
    public String updateData(@PathVariable int empId, @RequestBody Employee employee){
        employeeServiceImpl.updateData(empId,employee);
        return "updated data successfully";
    }
    @DeleteMapping("/deletedata/{empId}")
    public String deleteById(@PathVariable int empId){
        employeeServiceImpl.deleteById(empId);
        return "data deleted successfully";
    }
}
