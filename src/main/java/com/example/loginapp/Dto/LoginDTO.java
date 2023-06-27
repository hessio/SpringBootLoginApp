package com.example.loginapp.Dto;

public class LoginDTO {
	
	private String email;
	private String password;
	
	public LoginDTO(){
		
	}
	
	public LoginDTO(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "LoginDTO{email="+email+", password="+password+"}";
	}
	

}
