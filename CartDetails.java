package com.shopping.dto;

import java.io.Serializable;

public class CartDetails  implements Serializable
{
//Cart_Id, Product_Id, Customer_Id, Product_Quantity
	private int cartId;
	private int pId;
	private int cId;
	private int pQuantity;
	public CartDetails()
	{
	}
	public CartDetails(int cartId, int pId, int cId, int pQuantity) {
		super();
		this.cartId = cartId;
		this.pId = pId;
		this.cId = cId;
		this.pQuantity = pQuantity;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	@Override
	public String toString() {
		return "CartDetails [cartId=" + cartId + ", pId=" + pId + ", cId=" + cId + ", pQuantity=" + pQuantity + "]";
	};
	public void displayCart()
	{
		System.out.println("Cart id is : "+getCartId());
		System.out.println("Product id is : "+getpId());
		System.out.println("customer id  is : "+getcId());
		System.out.println("Product quantity  is : "+getpQuantity());


	}
}
