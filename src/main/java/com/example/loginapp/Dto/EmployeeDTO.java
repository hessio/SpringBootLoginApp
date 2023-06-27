package com.example.loginapp.Dto;

public class EmployeeDTO {
	
	private int employeeid;
	private String employeename;
	private String email;
	private String password;
	
	public EmployeeDTO() {
			
	    }

	public EmployeeDTO(int employeeid, String employeename, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getPassword() {
    	return this.password;
    }
    
    public void setEmployeename(String employeename) {
    	this.employeename = employeename;
    }
    
    public String getEmployeename() {
    	return this.employeename;
    }
    
    public void setEmployeeid(int employeeid) {
    	this.employeeid = employeeid;
    }
    
    public int getEmployeeid() {
    	return this.employeeid;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    @Override
    public String toString() {
    	return "Employee{ employeeis=" + employeeid + ", employeename=" + employeename + ", email="
    			+ email + ", password=" + password;
    }
    
}
