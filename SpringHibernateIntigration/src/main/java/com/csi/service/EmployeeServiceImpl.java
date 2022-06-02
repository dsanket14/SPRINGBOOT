package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDaoImpl;
	
	@Override
	public void saveData(Employee employee) {
		employeeDaoImpl.saveData(employee);
		
	}

	@Override
	public List<Employee> getAllData() {
	
		return employeeDaoImpl.getAllData();
	}
	

}
