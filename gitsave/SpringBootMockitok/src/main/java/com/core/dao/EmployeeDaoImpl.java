package com.core.dao;

import com.core.model.Employee;
import com.core.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveData(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public Employee updateData(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public void deleteByEmpId(int empId){
        employeeRepoImpl.deleteById(empId);
    }
}
