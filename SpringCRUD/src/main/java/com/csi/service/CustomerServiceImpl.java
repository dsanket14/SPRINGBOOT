package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;

    @Override
    public void saveData(Customer customer) {
        customerDaoImpl.saveData(customer);
    }

    @Override
    public Customer getDataById(int customerId) {
        return customerDaoImpl.getDataById(customerId);
    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    @Override
    public void updateData(int customerId, Customer customer) {
        customerDaoImpl.updateData(customerId,customer);
    }

    @Override
    public void deleteData(int customerId) {
        customerDaoImpl.deleteData(customerId);
    }
}
