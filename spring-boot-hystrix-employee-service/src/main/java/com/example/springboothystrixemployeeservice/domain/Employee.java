package com.example.springboothystrixemployeeservice.domain;
public class Employee {
	 
    private String name;
    private String emp_id;
 
    public Employee(String name, String emp_id) {
        super();
        this.name = name;
        this.emp_id = emp_id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
 

}
