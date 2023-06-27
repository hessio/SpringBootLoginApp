package com.example.loginapp.Service;

import com.example.loginapp.Dto.EmployeeDTO;
import com.example.loginapp.Dto.LoginDTO;
import com.example.loginapp.Response.LoginResponse;
//import com.example.loginapp.Response.LoginResponse;

public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);
	LoginResponse loginEmployee(LoginDTO loginDTO);

//	LoginResponse loginEmployee(LoginDTO loginDTO);

}
