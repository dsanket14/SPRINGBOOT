package com.core.service;

import com.core.dao.CustomerDaoImpl;
import com.core.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public Customer saveData(Customer customer){
        return customerDaoImpl.saveData(customer);
    }

    public List<Customer> getAllData(){
        return  customerDaoImpl.getAllData();
    }

    public Optional<Customer> getDataById(int custId){
        return customerDaoImpl.getDataById(custId);
    }

    public Customer updateData(Customer customer){
        return  customerDaoImpl.updateData(customer);
    }

    @Cacheable(value = "custId")
    public void deleteById(int custId){
        customerDaoImpl.deleteById(custId);
    }
}
