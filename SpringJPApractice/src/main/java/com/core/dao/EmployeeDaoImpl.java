package com.core.dao;

import com.core.model.Employee;
import com.core.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeDaoImpl {

        @Autowired
        EmpRepo empRepoImpl;

        public Employee saveData(Employee employee){
            return empRepoImpl.save(employee);
        }

        public Optional<Employee> getDataById(int empId){
            return empRepoImpl.findById(empId);
        }

}


