package com.example.demo;

public class User {
	private String name;
	private String address;
	private String tel;
	private String inquiryTypes;
	
	public User() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getinquiryType(){
		return inquiryTypes;
	}
	public void setinquiryType(String inquiryType){
		this.inquiryTypes =inquiryType;
	}
}
