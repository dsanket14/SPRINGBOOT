package com.core.service;

import com.core.dao.CustomerDaoImpl;
import com.core.model.Customer;
import com.core.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return customerDaoImpl.getAllData();
    }

    public Optional<Customer> getDataByCustId(int custId){
        return  customerDaoImpl.getDataByCustId(custId);
    }

    public void deleteByCustId(int custId){
        customerDaoImpl.deleteByCustId(custId);
    }
}
