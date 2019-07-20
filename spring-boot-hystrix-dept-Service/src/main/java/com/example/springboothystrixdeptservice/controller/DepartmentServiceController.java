package com.example.springboothystrixdeptservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboothystrixdeptservice.delegate.EmployeeServiceDelegate;
 
@RestController
public class DepartmentServiceController {
     
    @Autowired
    EmployeeServiceDelegate employeeServiceDelegate;
 
    @RequestMapping(value = "/getEmployeeDetails/{deptname}", method = RequestMethod.GET)
    public String getEmployees(@PathVariable String deptname) {
        System.out.println("Going to call employee service to get data!");
        return employeeServiceDelegate.callEmployeeServiceAndGetData(deptname);
    }
}