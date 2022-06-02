package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee signUp(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public boolean signIn(String empEmailId, String empPassword){
        boolean flag=false;

        for (Employee emp:employeeRepoImpl.findAll())
        {
              if(emp.getEmpEmailId().equals(empEmailId) && emp.getEmpPassword().equals(empPassword))
              {
                  flag=true;
              }
        }

        return  flag;
    }

    public List<Employee> saveBulOfData(List<Employee> employees){
        return employeeRepoImpl.saveAll(employees);
    }

    public Optional<Employee> getDataByEmpId(int empId){
        return  employeeRepoImpl.findById(empId);
    }

    public  Employee getDataByEmpEmailId(String empEmailId){
        return employeeRepoImpl.findByEmpEmailId(empEmailId);
    }

    public  Employee getDataByEmpMb(long empMb){
        return employeeRepoImpl.findByEmpMb(empMb);
    }

    public List<Employee> filterDataByEmpSalary(double empSalary){
        return employeeRepoImpl.findAll().stream().filter(emp->emp.getEmpSalary()>=empSalary).collect(Collectors.toList());
    }

    public  List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public Employee updateData(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public void deletedDataById(int empId){
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAllData(){
        employeeRepoImpl.deleteAll();
    }

}
