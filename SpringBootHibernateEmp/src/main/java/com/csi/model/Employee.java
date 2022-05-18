package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    private String empName;
    private String empAddress;
    private long empMb;
    @JsonFormat(pattern = "dd-mm-yyy",timezone = "Asia/Kolkata")
    private Date empDOB;
    private String empEmailId;
    private  String empPassword;
    private  double empSalary;

}