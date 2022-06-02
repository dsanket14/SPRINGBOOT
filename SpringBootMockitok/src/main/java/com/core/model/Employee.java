package com.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private  int empId;

    @NotEmpty
    @Pattern(regexp = "^[a-b]",message = "plz use only a-z char")
    private String empName;

    private double empSalary;

    @JsonFormat(pattern = "dd-mm-yyyy",timezone = "Asia/Kolkata")
    private Date empDOB;
}
