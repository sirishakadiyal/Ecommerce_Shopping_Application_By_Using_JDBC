package com.shopping.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class OrderDetails implements Serializable
{
	//Order_Id, Customer_Id, Product_Id, Product_Quantity, Order_Address, Order_Details
     private int oId;
     private int cId;
     private int pId;
     private int pQuantity;
     private String oADdress;
     private String oDetails;
     private LocalDate oDate;
     public OrderDetails()
     {
    	 
     }
	 public OrderDetails(int oId, int cId, int pId, int pQuantity, String oADdress, String oDetails,LocalDate oDate) {
		super();
		this.oId = oId;
		this.cId = cId;
		this.pId = pId;
		this.pQuantity = pQuantity;
		this.oADdress = oADdress;
		this.oDetails = oDetails;
		this.oDate=oDate;
	 }
	
	 public int getoId() {
		return oId;
	}
	 public void setoId(int oId) {
		 this.oId = oId;
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
	 public int getpQuantity() {
		 return pQuantity;
	 }
	 public void setpQuantity(int pQuantity) {
		 this.pQuantity = pQuantity;
	 }
	 public String getoADdress() {
		 return oADdress;
	 }
	 public void setoADdress(String oADdress) {
		 this.oADdress = oADdress;
	 }
	 public String getoDetails() {
		 return oDetails;
	 }
	 public void setoDetails(String oDetails) {
		 this.oDetails = oDetails;
	 }
	 public LocalDate getoDate() {
		 return oDate;
	 }
	 public void setoDate(LocalDate oDate) {
		 this.oDate = oDate;
	 }
	 @Override
	 public String toString() {
		return "OrderDetails [oId=" + oId + ", cId=" + cId + ", pId=" + pId + ", pQuantity=" + pQuantity + ", oADdress="
				+ oADdress + ", oDetails=" + oDetails + "]";
	 };
     public void displayOrder()
     {
    	 System.out.println(" Order id is :"+getoId());
    	 System.out.println(" customer  id is :"+getcId());
    	 System.out.println(" product id is :"+getpId());
    	 System.out.println(" Prodtc quantity is :"+getpQuantity());
    	 System.out.println(" Order address is :"+getoADdress());
    	 System.out.println(" Order details is :"+getoDetails());
    	 System.out.println("Order date is "+getoDate());
     }
}
