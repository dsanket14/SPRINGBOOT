package com.core.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id

    private int custId;

    private String custName;

    private String custAddress;

    @JsonFormat(pattern = "dd/mm/yyy",timezone = "Asia/Kolkata")
    private Date custDOB;

    private long custMb;

    private String custEmailId;

}
