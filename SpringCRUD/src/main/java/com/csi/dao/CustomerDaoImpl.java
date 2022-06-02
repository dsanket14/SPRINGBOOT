package com.csi.dao;

import com.csi.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CustomerDaoImpl implements CustomerDao{
    private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
    @Override
    public void saveData(Customer customer) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

    }

    @Override
    public Customer getDataById(int customerId) {
        Session session = factory.openSession();

        Customer customer= (Customer) session.get(Customer.class, customerId);
        return customer;
    }

    @Override
    public List<Customer> getAllData() {
        Session session= factory.openSession();
        List<Customer> customers= session.createQuery("from Customer").list();
        return customers;
    }

    @Override
    public void updateData(int customerId, Customer customer) {
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        Customer cust= (Customer) session.get(Customer.class, customerId);

       cust.setCustomerId(customer.getCustomerId());
       cust.setCustomerName(customer.getCustomerName());
       cust.setCustomerCity(customer.getCustomerCity());
       cust.setCustomerMbno(customer.getCustomerMbno());
       cust.setCustomerDOB(customer.getCustomerDOB());
       session.update(cust);
       transaction.commit();
    }

    @Override
    public void deleteData(int customerId) {
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        Customer cust= (Customer) session.get(Customer.class, customerId);
        session.delete(cust);
        transaction.commit();

    }
}
