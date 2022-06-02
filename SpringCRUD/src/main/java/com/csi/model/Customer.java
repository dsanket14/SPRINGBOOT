package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue

    private  int customerId;
    private String customerName;
    private  String customerCity;
    private long customerMbno;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "Asia/Kolkata")
    private Date customerDOB;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public long getCustomerMbno() {
        return customerMbno;
    }

    public void setCustomerMbno(long customerMbno) {
        this.customerMbno = customerMbno;
    }

    public Date getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(Date customerDOB) {
        this.customerDOB = customerDOB;
    }
}
