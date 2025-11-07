package com.shopping.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductDetails implements Serializable
{
	//Product_Id, Product_Name, Product_Brand, Product_Price, Product_M_F_Date, Product_Ex_Date, Product_Quantity, Product_Category, Product_Discount
   private int pId;
   private String pName;
   private String pBrand;
   private double pPrice;
   private Date pMFDate;
   private Date pExDate;
   private int pQuantity;
   private String pCategory;
   private double pDiscount;
   public ProductDetails()
   {}
   public ProductDetails(int pId, String pName, String pBrand, double pPrice,Date pMFDate, Date pExDate, int pQuantity, String pCategory,
		double pDiscount) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pBrand = pBrand;
	this.pPrice=pPrice;
	this.pMFDate = pMFDate;
	this.pExDate = pExDate;
	this.pQuantity = pQuantity;
	this.pCategory = pCategory;
	this.pDiscount = pDiscount;
   }
   public int getpId() {
	return pId;
   }
   public void setpId(int pId) {
	this.pId = pId;
   }
   public String getpName() {
	return pName;
   }
   public void setpName(String pName) {
	this.pName = pName;
   }
   public String getpBrand() {
	return pBrand;
   }
   public void setpBrand(String pBrand) {
	this.pBrand = pBrand;
   }
   public double getpPrice() {
		return pPrice;
	   }
	   public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	   }
   public Date getpMFDate() {
	return pMFDate;
   }
   public void setpMFDate(Date pMFDate) {
	this.pMFDate = pMFDate;
   }
   public Date getpExDate() {
	return pExDate;
   }
   public void setpExDate(Date pExDate) {
	this.pExDate = pExDate;
   }
   public int getpQuantity() {
	return pQuantity;
   }
   public void setpQuantity(int pQuantity) {
	this.pQuantity = pQuantity;
   }
   public String getpCategory() {
	return pCategory;
   }
   public void setpCategory(String pCategory) {
	this.pCategory = pCategory;
   }
   public double getpDiscount() {
	return pDiscount;
   }
   public void setpDiscount(double pDiscount) {
	this.pDiscount = pDiscount;
   }
   @Override
   public String toString() {
	return "ProductDetails [pId=" + pId + ", pName=" + pName + ", pBrand=" + pBrand + ", pMFDate=" + pMFDate
			+ ", pExDate=" + pExDate + ", pQuantity=" + pQuantity + ", pCategory=" + pCategory + ", pDiscount="
			+ pDiscount + "]";
   };
   public void displayProduct()
   {
	   System.out.println("Product Id is : "+getpId());
	   System.out.println("Product Name is : "+getpName());
	   System.out.println("Product Brand is : "+getpBrand());
	   System.out.println("Product manfacture date is : "+getpMFDate());
	   System.out.println("Product Expire date is : "+getpExDate());
	   System.out.println("Product Quantity is : "+getpQuantity());
	   System.out.println("Product cateogory is : "+getpCategory());
	   System.out.println("Product discount  is : "+getpDiscount());

   }
   }