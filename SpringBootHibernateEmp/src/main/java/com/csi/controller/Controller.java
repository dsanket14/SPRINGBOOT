package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    EmployeeService employeeServiceImpl;

    @GetMapping("/getAllData")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }
    @GetMapping("/getdatabyid/{empId}")
    public  Employee getDataById(@PathVariable int empId){
        return employeeServiceImpl.getDataById(empId);
    }
    @GetMapping("/getdatabyemailid/{empEmailId}")
    public Employee getDataByEmail(@PathVariable String empEmailId){
        return employeeServiceImpl.getDataByEmail(empEmailId);
    }
    @GetMapping("/getdatabyempmb/{empMb}")
    public Employee getDataByMb(@PathVariable long empMb){
        return employeeServiceImpl.getDataByMb(empMb);
    }
    @GetMapping("/filterdata/{empSalary}")
    public List<Employee>filterData(@PathVariable double empSalary){
        return employeeServiceImpl.filterData(empSalary);
    }
    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public boolean signIn(@PathVariable String empEmailId, @PathVariable String empPassword){
        return employeeServiceImpl.signIn(empEmailId,empPassword);
    }
    @PostMapping("/signup")
    public String signUp(@RequestBody Employee employee){
        employeeServiceImpl.signUp(employee);
        return "signup Successfully";
    }
    @PostMapping("/savebulkofdata")
    public String savebulkofData(@RequestBody List<Employee> employees) {
        employeeServiceImpl.saveBulOfData(employees);
        return "save bulk of data Successfully";
    }
    @PutMapping("/updatedata/{empId}")
    public String updateData(@RequestBody int empId,@RequestBody Employee employee){
            employeeServiceImpl.updateData(empId,employee);
            return "data updated successfully";
        }
    @DeleteMapping("/deletedatabyid/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return "Data deleted Successfully";
    }
    @DeleteMapping("/deletealldata")
    public String deleteAllData(){
        employeeServiceImpl.deleteAllData();
        return "all data deleted";

    }
}
