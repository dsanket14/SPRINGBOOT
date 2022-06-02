package com.csi.dao;

import com.csi.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao{

    private static SessionFactory factory= new AnnotationConfiguration().configure().buildSessionFactory();
    @Override
    public void saveData(Customer customer) {
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(customer);
        transaction.commit();
    }

    @Override
    public Customer getDataById(int custId) {
        Session session=factory.openSession();

        Customer customer = (Customer) session.get(Customer.class, custId);
        return customer;
    }

    @Override
    public List<Customer> getAllData() {
        Session session=factory.openSession();
        List<Customer> customerList = session.createQuery("from Customer").list();

        return customerList;
    }

    @Override
    public void updateData(int custId, Customer customer) {
        Session session=factory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer cust = (Customer) session.get(Customer.class, custId);

        cust.setCustID(customer.getCustID());
        cust.setCustName(customer.getCustName());
        cust.setCustMb(customer.getCustMb());
        cust.setCustDOB(customer.getCustDOB());
        session.update(cust);
        transaction.commit();

    }

    @Override
    public void deleteData(int custId) {
        Session session=factory.openSession();

        Transaction transaction = session.beginTransaction();

        Customer cust = (Customer) session.get(Customer.class, custId);

        session.delete(cust);
        transaction.commit();
    }
}
