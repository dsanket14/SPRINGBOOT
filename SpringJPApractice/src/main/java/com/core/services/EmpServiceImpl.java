package com.core.services;

import com.core.dao.EmployeeDaoImpl;
import com.core.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee saveData(Employee employee){
        return employeeDaoImpl.saveData(employee);
    }

    public Optional<Employee> getDataById(int empId){
        return employeeDaoImpl.getDataById(empId);
    }
}
