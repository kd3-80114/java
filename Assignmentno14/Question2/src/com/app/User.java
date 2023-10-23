package com.app;
public class User 
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	private String first_name;
	private String list_name;
	private String email;
	private String password;
	private boolean status;
	private String role;
	private String dob;
	
	public User(String first_name, String list_name, String email, String password, boolean status, String role,String dob,int id) {
		this.first_name = first_name;
		this.list_name = list_name;
		this.email = email;
		this.password = password;
		this.status = status;
		this.role = role;
		this.dob=dob;
		this.id=id;
	}
	public User(String fname1, String lname, int id2) {
		this.first_name=fname1;
		this.list_name=lname;
		this.id=id2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDAO [first_name=" + first_name + ", list_name=" + list_name + ", email=" + email + ", password="
				+ password + ", status=" + status + ", role=" + role + ", dob=" + dob + "]";
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getList_name() {
		return list_name;
	}
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

} 