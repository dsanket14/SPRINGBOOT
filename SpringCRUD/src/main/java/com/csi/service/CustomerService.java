package com.csi.service;

import com.csi.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CustomerService {
    public void saveData(Customer customer);

    public  Customer getDataById(int customerId);

    public List<Customer> getAllData();

    public void updateData(int customerId, Customer customer);

    public  void deleteData(int customerId);
}
