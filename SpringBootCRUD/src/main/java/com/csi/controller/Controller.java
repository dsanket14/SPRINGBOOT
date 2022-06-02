package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    CustomerService CustomerServiceImpl;

    @GetMapping("/getalldata")
    public ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(CustomerServiceImpl.getAllData());
    }

    @GetMapping("/getdatabyid/{custId}")
    public ResponseEntity<Customer> getDataById(@PathVariable int custId)
    {
        return ResponseEntity.ok(CustomerServiceImpl.getDataById(custId));
    }

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Customer customer){
        CustomerServiceImpl.saveData(customer);
        return ResponseEntity.ok("Customer Data Saved Successfully");
    }

    @PutMapping("/updatedata/{custId}")
    public ResponseEntity<String> updateData(@PathVariable int custId, @RequestBody Customer customer){
        CustomerServiceImpl.updateData(custId, customer);
        return ResponseEntity.ok("Customer Data Updated Successfully");
    }

    @DeleteMapping("/deletedata/{custId}")
    public ResponseEntity<String> deleteData(@PathVariable int custId){
        CustomerServiceImpl.deleteData(custId);
        return ResponseEntity.ok("Customer Data Deleted Successfully");
    }

}
