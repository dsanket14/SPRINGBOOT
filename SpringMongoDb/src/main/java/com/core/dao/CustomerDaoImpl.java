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
        return customerRepoImpl.findAll();
    }

    public Optional<Customer> getDataByCustId(int custId){
        return  customerRepoImpl.findById(custId);
    }

    public void deleteByCustId(int custId){
        customerRepoImpl.deleteById(custId);
    }
}
