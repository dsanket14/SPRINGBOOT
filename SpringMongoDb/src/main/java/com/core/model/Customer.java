package com.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Customer {


    private int custId;

    private String custName;

    private  double custSalary;
}
