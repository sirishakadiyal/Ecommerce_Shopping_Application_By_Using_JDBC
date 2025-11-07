package com.shopping.dto;

import java.io.Serializable;

public class CustomerDetails implements Serializable
{
	//Customer_Id, Customer_Name, Customer_Email_Id, Customer_Mobile_Number, Customer_Address, Customer_Gender, Customer_Password
    private int cId;
	private String cName;
	private String cEmail;
	private long cMbNum;
	private String cAddress;
	private String cGender;
	private String cPassword;
	public CustomerDetails() {};
	public CustomerDetails(int cId, String cName, String cEmail, long cMbNum, String cAddress, String cGender,
			String cPassword) {
		super();
		this.cId = cId;
		this.cEmail = cEmail;
		this.cMbNum = cMbNum;
		this.cAddress = cAddress;
		this.cGender = cGender;
		this.cPassword = cPassword;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public long getcMbNum() {
		return cMbNum;
	}
	public void setcMbNum(long cMbNum) {
		this.cMbNum = cMbNum;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcGender() {
		return cGender;
	}
	public void setcGender(String cGender) {
		this.cGender = cGender;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	
	//Customer_Id, Customer_Name, Customer_Email_Id, Customer_Mobile_Number, Customer_Address, Customer_Gender, Customer_Password

	@Override
	public String toString() {
		return "CustomerDetails [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cMbNum=" + cMbNum
				+ ", cAddress=" + cAddress + ", cGender=" + cGender + ", cPassword=" + cPassword + ", getcId()="
				+ getcId() + ", getcName()=" + getcName() + ", getcEmail()=" + getCEmail() + ", getcMbNum()="
				+ getcMbNum() + ", getcAddress()=" + getcAddress() + ", getcGender()=" + getcGender()
				+ ", getcPassword()=" + getcPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void displayCustomer()
	{
		System.out.println(" Customer name is :"+getcName());
		System.out.println(" Customer  id is :"+getcId());
		System.out.println(" Customer email is :"+getCEmail());
		System.out.println(" Customer mb num is :"+getcMbNum());
		System.out.println(" Customer  Address is :"+getcAddress());
		System.out.println(" Customer  gender  is :"+getcGender());
		System.out.println(" Customer  password is :"+getcPassword());
	}
	
}
