package com.csi.dao;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    String Insert_SQL ="insert into employee (empId,empName,empSalary,empDOB) values (?,?,?,?)";

    String Update_SQL ="update employee set empName=?,empSalary=?,empDOB=? where empId=?";

    String Delete_SQL="delete from employee where empId=?";

    String Select_SQl="select * from employee";

    private Employee employee(ResultSet resultSet,int numRow) throws SQLException {
        return Employee.builder().empId(resultSet.getInt(1)).empName(resultSet.getString(2)).empSalary(resultSet.getDouble(3)).empDOB(resultSet.getDate(4)).build();
    }

    @Override
    public Employee saveAllData(Employee employee) {
        jdbcTemplate.update(Insert_SQL,employee.getEmpId(),employee.getEmpName(),employee.getEmpSalary(),employee.getEmpDOB());
        return employee;
    }

    @Override
    public List<Employee> getAllData() {
        return jdbcTemplate.query(Select_SQl,this::employee);
    }

    @Override
    public void updateData(int empId, Employee employee) {
        jdbcTemplate.update(Update_SQL,employee.getEmpName(),employee.getEmpSalary(),employee.getEmpDOB(),employee.getEmpId());
    }

    @Override
    public void deleteById(int empId) {

        jdbcTemplate.update(Delete_SQL,empId);

    }
}
