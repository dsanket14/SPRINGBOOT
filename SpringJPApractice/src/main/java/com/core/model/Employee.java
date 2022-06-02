package com.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    private String empAddress;
    private String empName;
    @JsonFormat(pattern = "dd/mm/yyyy",timezone = "Asia/Kolkata")
    private Date empDOB;
}
