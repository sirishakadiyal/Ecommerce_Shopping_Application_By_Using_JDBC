package com.shopping.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class PaymentDetails implements Serializable
{
	//Payment_Id, Customer_Id, Product_Id, Payment_Status, Amount, Payment_Date
	private int payId;
	private int cId;
	private int pId;
	private double amount;
	private String payStatus;
	private LocalDate payDate;
	private String payType;
	public PaymentDetails() {
		
	}
	public PaymentDetails(int payId, int cId, int pId, double amount, String payStatus, LocalDate payDate, String payType) {
		super();
		this.payId = payId;
		this.cId = cId;
		this.pId = pId;
		this.amount = amount;
		this.payStatus = payStatus;
		this.payDate = payDate;
		this.payType = payType;
	}

	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public LocalDate getPayDate() {
		return payDate;
	}
	public void setPayDate(LocalDate payDate) {
		this.payDate=payDate;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	@Override
	public String toString() {
		return "PaymentDetails [payId=" + payId + ", cId=" + cId + ", pId=" + pId + ", payStatus=" + payStatus
				+ ", payDate=" + payDate + "]";
	};
	public void displayPayment()
	{
		System.out.println(" Payment id is : "+getPayId());
		System.out.println("Cutsomer id is : "+getcId());
         System.out.println("Product id is : "+getpId());
         System.out.println("Product amount is "+getAmount());
         System.out.println("Payment Status is : "+getPayStatus());
         System.out.println(" payment date is : "+getPayDate());
         System.out.println("Payments type is "+getPayType());
	}
}
