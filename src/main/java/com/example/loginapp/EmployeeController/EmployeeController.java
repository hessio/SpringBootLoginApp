package com.example.loginapp.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginapp.Dto.EmployeeDTO;
import com.example.loginapp.Dto.LoginDTO;
import com.example.loginapp.Response.LoginResponse;
import com.example.loginapp.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")

public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;
	
	@PostMapping(path="/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	@PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
