package com.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {

    private String toEmail;
    private String emailSubject;
    private String emailBoby;
    private String attachment;
}
