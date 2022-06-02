package com.core.controller;

import com.core.excep.CustomerExcpRecordNotFound;
import com.core.model.Customer;
import com.core.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CustomerControllerImpl {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/getalldata")
    public List<Customer> getAllData(){
        return customerServiceImpl.getAllData();
    }
    @GetMapping("/getdatabyid/{custId}")
    public Optional<Customer> getDataById(@PathVariable int custId){
        return customerServiceImpl.getDataById(custId);
    }
    @PostMapping("/savedata")
    public Customer saveData(@RequestBody Customer customer){
        return customerServiceImpl.saveData(customer);
    }
    @PutMapping("/updatedata")
    public Customer updateData(@PathVariable int custId,@RequestBody Customer customer) throws CustomerExcpRecordNotFound {
        Customer customer1 = customerServiceImpl.getDataById(custId).orElseThrow(()-> new CustomerExcpRecordNotFound("Customer Id Doesn't exist"));
        return customerServiceImpl.updateData(customer1);
    }
    @DeleteMapping("/deletedatabyid/{custId}")
    public void deletDataById(int custId){
        customerServiceImpl.deleteById(custId);
    }
}
