package com.core.controller;

import com.core.model.Customer;
import com.core.service.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/getalldata")
    public ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(customerServiceImpl.getAllData());
    }
    @PostMapping("/savedata")
    public Customer saveData(@RequestBody Customer customer){
        log.info("*******trying to save********"+customer.getCustName());
        return customerServiceImpl.saveData(customer);
    }
    @GetMapping("/getdatabyid/{custId}")
    public Optional<Customer> getDataById(@PathVariable int custId){
        return customerServiceImpl.getDataByCustId(custId);
    }
    @DeleteMapping("/deletedatabyid/{custId}")
    public void deleteBycustId(@PathVariable int custId){
        customerServiceImpl.deleteByCustId(custId);
    }
}
