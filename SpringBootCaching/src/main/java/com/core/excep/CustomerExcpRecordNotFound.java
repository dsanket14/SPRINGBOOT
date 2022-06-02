package com.core.excep;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerExcpRecordNotFound extends Exception{
    public CustomerExcpRecordNotFound(String msg) {

        super(msg);
    }
}
