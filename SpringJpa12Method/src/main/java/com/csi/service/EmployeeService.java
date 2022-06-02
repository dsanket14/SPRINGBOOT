package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee signUp(Employee employee){
        return  employeeDaoImpl.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword){
        return employeeDaoImpl.signIn(empEmailId,empPassword);
    }

    public List<Employee> saveBulOfData(List<Employee> employees){
        return employeeDaoImpl.saveBulOfData(employees);
    }

    public Optional<Employee> getDataByEmpId(int empId){
        return  employeeDaoImpl.getDataByEmpId(empId);
    }

    public  Employee getDataByEmpMb(long empMb){
        return employeeDaoImpl.getDataByEmpMb(empMb);
    }

    public  Employee getDataByEmpEmailId(String empEmailId){
        return  employeeDaoImpl.getDataByEmpEmailId(empEmailId);
    }

    public List<Employee> filterDataByEmpSalary(double empSalary){
        return employeeDaoImpl.filterDataByEmpSalary(empSalary);
    }
    public List<Employee> getAllData(){
        return employeeDaoImpl.getAllData();
    }

    public Employee updateData(Employee employee){
        return employeeDaoImpl.updateData(employee);
    }

    public void deleteDataById(int empId){
        employeeDaoImpl.deletedDataById(empId);
    }
    public void deleteAllData(){
        employeeDaoImpl.deleteAllData();
    }
}
