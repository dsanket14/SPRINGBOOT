package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveAllData(Employee employee);

    public List<Employee> getAllData();

    public void updateData(int empId, Employee employee);

    public void deleteById(int empId);
}
