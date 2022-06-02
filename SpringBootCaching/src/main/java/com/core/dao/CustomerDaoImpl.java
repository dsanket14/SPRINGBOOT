package com.core.dao;

import com.core.model.Customer;
import com.core.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> getAllData(){
        return  customerRepoImpl.findAll();
    }

    public Optional<Customer> getDataById(int custId){
        return customerRepoImpl.findById(custId);
    }

    public Customer updateData(Customer customer){
        return  customerRepoImpl.save(customer);
    }
    public void deleteById(int custId){
        customerRepoImpl.deleteById(custId);
    }
}
