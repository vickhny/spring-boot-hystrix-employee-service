package com.example.springboothystrixemployeeservice.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboothystrixemployeeservice.domain.Employee;
 
@RestController
public class EmployeeServiceController {
 
    private static Map<String, List<Employee>> employeeDB = new HashMap<String, List<Employee>>();
 
    static {
    	employeeDB = new HashMap<String, List<Employee>>();
 
        List<Employee> lst = new ArrayList<Employee>();
        Employee emp = new Employee("Richa", "001");
        lst.add(emp);
        emp = new Employee("Vikash", "002");
        lst.add(emp);
 
        employeeDB.put("IT", lst);
 
        lst = new ArrayList<Employee>();
        emp = new Employee("Kajal", "005");
        lst.add(emp);
        emp = new Employee("Sukesh", "009");
        lst.add(emp);
 
        employeeDB.put("HR", lst);
 
    }
 
    @RequestMapping(value = "/getEmployeeDetailsForDept/{deptname}", method = RequestMethod.GET)
    public List<Employee> getEmployees(@PathVariable String deptname) {
        System.out.println("Getting Student details for " + deptname);
 
        List<Employee> employeeList = employeeDB.get(deptname);
        if (employeeList == null) {
            employeeList = new ArrayList<Employee>();
            Employee emp = new Employee("Not Found", "N/A");
            employeeList.add(emp);
        }
        return employeeList;
    }
}
