package com.csi.mpdel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    @Id
    private  int prodId;
    private String prodName;
    private double prodPrice;

    @JsonFormat(pattern = "dd-mm-yyy")
    private Date prodLunchdate;
}
