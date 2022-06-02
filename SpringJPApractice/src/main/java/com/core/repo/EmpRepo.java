package com.core.repo;


import com.core.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
    //here we decleare our own method
}
