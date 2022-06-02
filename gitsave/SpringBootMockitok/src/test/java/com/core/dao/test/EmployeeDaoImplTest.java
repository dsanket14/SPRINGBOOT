package com.core.dao.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.core.dao.EmployeeDaoImpl;
import com.core.model.Employee;
import com.core.repo.EmployeeRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @MockBean
    EmployeeRepo employeeRepo;

    @Test
    public void saveData(){
        Date dob=null;

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");

        try {
            dob=simpleDateFormat.parse("12-01-2001");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Employee employee=new Employee(1,"Sanket",34500,dob);
        employeeDaoImpl.saveData(employee);

        verify(employeeRepo,times(1)).save(employee);
    }

    @Test
    public void getAllData(){
        Date dob=null;

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");

        try {
            dob=simpleDateFormat.parse("12-01-2001");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        when(employeeRepo.findAll()).thenReturn(Stream.of(new Employee(1,"Sanket",34500,dob)).collect(Collectors.toList()));

        assertEquals(1,employeeDaoImpl.getAllData().size());
    }
    @Test
    public void updateData(){
        Date dob=null;

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");

        try {
            dob=simpleDateFormat.parse("12-01-2001");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Employee employee=new Employee(1,"Sanket",34500,dob);
        employeeDaoImpl.updateData(employee);

        verify(employeeRepo,times(1)).save(employee);
    }
    @Test
    public void deleteByEmpId(){
        Date dob=null;

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");

        try {
            dob=simpleDateFormat.parse("12-01-2001");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Employee employee=new Employee(1,"Sanket",34500,dob);
        employeeDaoImpl.deleteByEmpId(employee.getEmpId());

        verify(employeeRepo,times(1)).deleteById(employee.getEmpId());
    }
}
