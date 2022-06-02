package com.csi.controller;

import com.csi.exception.RecordNotFound;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String empEmailId, @PathVariable String empPassword){
        return ResponseEntity.ok(employeeServiceImpl.signIn(empEmailId,empPassword));
    }
    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataByEmpId(@PathVariable int empId){
        log.info("******trying to featch data:"+empId);
        return  ResponseEntity.ok(employeeServiceImpl.getDataByEmpId(empId));
    }
    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        log.info("********Employee Record"+employeeServiceImpl.getAllData().size());
        return  employeeServiceImpl.getAllData();
    }
    @GetMapping("/getdatabyempemailid/{empEmailId}")
    public Employee getDataByEmpEmailId(@PathVariable String empEmailId){
        return employeeServiceImpl.getDataByEmpEmailId(empEmailId);
    }
    @GetMapping("/getdatabyempmb/{empMb}")
    public Employee getDataByEmpMb(@PathVariable long empMb){
        return employeeServiceImpl.getDataByEmpMb(empMb);
    }
    @GetMapping("/filterdata/{empSalary}")
    public List<Employee> filterDataByEmpSalary(@PathVariable double empSalary){
        return employeeServiceImpl.filterDataByEmpSalary(empSalary);
    }
    @PostMapping("/signup")
    public Employee signUp(@RequestBody Employee employee){
        log.info("*****trying to signup"+employee.getEmpName());
        return employeeServiceImpl.signUp(employee);
    }
    @PostMapping("/savealldata")
    public List<Employee> saveAllData(@RequestBody List<Employee> employees){
        return  employeeServiceImpl.saveBulOfData(employees);
    }
    @PutMapping("/updatedata/{empId}")
    public Employee updateData(@PathVariable int empId, @RequestBody Employee employee)throws RecordNotFound {
        log.info("****trying to update data for :"+employee.getEmpName());

        Employee employee1=employeeServiceImpl.getDataByEmpId(empId).orElseThrow(()-> new RecordNotFound("Employee not found"));
        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpEmailId(employee.getEmpEmailId());
        employee1.setEmpPassword(employee.getEmpPassword());
        employee1.setEmpAddress(employee.getEmpAddress());
        employee1.setEmpDOB(employee.getEmpDOB());
        employee1.setEmpMb(employee.getEmpMb());
        employee1.setEmpSalary(employee.getEmpSalary());

        return  employeeServiceImpl.updateData(employee1);
    }
    @DeleteMapping("deletebyid/{empId}")
    public String deleteByEmpId(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return "Data Deleted Successfully";
    }
    @DeleteMapping("deletealldata")
    public String  deleteAllData(){
        employeeServiceImpl.deleteAllData();
        return "Data Deleted Successfully";
    }

}
