package com.core.controller;

import com.core.model.Employee;
import com.core.services.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpServiceImpl empService;

    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){
        return empService.saveData(employee);
    }
}
