package com.core.service;

import com.core.dao.CustomerDaoImpl;
import com.core.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDao;


    public Customer saveData(Customer customer){
        return customerDao.saveData(customer);
    }

    public Optional<Customer> getDataById(int custId){
        return customerDao.getDataById(custId);
    }

    public List<Customer> getAlldata(){
        return customerDao.getAlldata();
    }

    public  Customer updateData(Customer customer){
        return customerDao.updateData(customer);
    }

    @Cacheable(value = "custId")
    public void deleteById(int custId){
        customerDao.deleteById(custId);
    }

}
