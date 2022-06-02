package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerServiceImpl;

    @GetMapping("/getalldata")
    public List<Customer>getAllData(){
        return customerServiceImpl.getAllData();
    }

    @GetMapping("getdatabyid/{customerId}")
    public  Customer getDataById(@PathVariable int customerId){
        return customerServiceImpl.getDataById(customerId);
    }
    @PostMapping("/savedata")
    public String saveData(@RequestBody Customer customer){
        customerServiceImpl.saveData(customer);
        return "Customer data Saved Successfully";
    }
    @PutMapping("/updatedata/{customerId}")
    public String updateData(@PathVariable int customerId ,@RequestBody  Customer customer){
        customerServiceImpl.updateData(customerId, customer);
        return "Customer data Updated Successfully";
    }
    @DeleteMapping("/deletedata/{customerId}")
    public  String deleteData(@PathVariable int customerId){
        customerServiceImpl.deleteData(customerId);
        return "Customer data deleted Successfully";
    }

}
