package com.core.controller;

import com.core.exception.RecordNotFound;
import com.core.model.Customer;
import com.core.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/getatabyid/{custId}")
    public Optional<Customer> getDataById(@PathVariable int custId){
        return customerServiceImpl.getDataById(custId);
    }
    @GetMapping("/getalldata")
    public List<Customer> getAllData(){
        return customerServiceImpl.getAlldata();
    }
    @PostMapping("savedata")
    public  Customer saveData(@RequestBody Customer customer){
        return  customerServiceImpl.saveData(customer);
    }

    @PutMapping("/updatedata/{custId}")
    public Customer updateData(@PathVariable int custId, @RequestBody Customer customer) throws RecordNotFound{

        Customer customer1 = customerServiceImpl.getDataById(custId).orElseThrow(()-> new RecoverableDataAccessException("Customer Id Doesn't exist"));
        customer1.setCustName(customer.getCustName());
        customer1.setCustAddress(customer.getCustAddress());
        customer1.setCustMb(customer.getCustMb());
        customer1.setCustDOB(customer.getCustDOB());
        customer1.setCustEmailId(customer.getCustEmailId());

        return customerServiceImpl.updateData(customer1);
    }
    @DeleteMapping("/deletedatabyid/{custId}")
    public String deleteById(@PathVariable int custId){
        customerServiceImpl.deleteById(custId);
        return "Data Deleted Successfully";
    }
}
