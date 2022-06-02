package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;

    private String empAddress;

    @Column(name = "emp_Mb",unique = true)
    private long empMb;

    private  double empSalary;

    @JsonFormat(pattern = "dd/mm/yy", timezone = "Asia/Kolkata")
    private String empDOB;

    @Column(name = "emp_EmailId",unique = true)
    private String empEmailId;

    private String empPassword;
}
