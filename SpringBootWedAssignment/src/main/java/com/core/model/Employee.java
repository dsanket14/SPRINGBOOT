package com.core.model;

import com.core.anno.MyAnno;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue

    @NotNull
    @Column(name = "Emp_Id")
    private int empId;

    @MyAnno
    @NotNull
    @Column(name = "Emp_First_Name")
    private  String empFirstName;

    @NotNull
    @Column(name = "Emp_Last_Name")
    private String empLastName;

    @NotNull
    @Column(name="Emp_Age")
    private int empAge;
}
