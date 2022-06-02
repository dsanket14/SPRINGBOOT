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
    private int custID;
    private String custName;
    private long custMb;
    @JsonFormat(pattern = "dd-mm-yyyy",timezone = "Asia/Kolkata")
    private Date custDOB;

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustMb() {
        return custMb;
    }

    public void setCustMb(long custMb) {
        this.custMb = custMb;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }
}
