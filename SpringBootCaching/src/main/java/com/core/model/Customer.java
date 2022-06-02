package com.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Customer {

    @Id
    @GeneratedValue
    private int CustId;

    private String CustName;

    private double CustSalary;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-mm-yyy",timezone = "Asia/Kolkata")
    private Date custDOB;
}
