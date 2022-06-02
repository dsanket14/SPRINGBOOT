package com.csi.dao;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerDao {

    public void saveData(Customer customer);

    public  Customer getDataById(int customerId);

    public List<Customer> getAllData();

    public void updateData(int customerId, Customer customer);

    public  void deleteData(int customerId);
}
