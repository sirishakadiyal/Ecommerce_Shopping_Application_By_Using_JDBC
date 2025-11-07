package com.shopping.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shopping.dao.ProductDAO;
import com.shopping.dto.ProductDetails;

public class ProductSerivce {
//stroeproductdetails()-->adminservice
	Scanner sc=new Scanner(System.in);
	ProductDAO productDAO=new ProductDAO();
	public void storeProductDetails()
	{
		System.out.println("Emter name");
		String pname=sc.next();
		System.out.println("Emter brand");
		String pbrand=sc.next();
		System.out.println("Emter price");
		double pprice=sc.nextDouble();
		System.out.println("Emter mf date");
		String pmdate=sc.next();
		System.out.println("Emter ex date");
		String pexdate=sc.next();
		System.out.println("Emter quatity");
		int pquantuty=sc.nextInt();
		System.out.println("Emter category");
		String pcategory=sc.next();
		System.out.println("Emter siscount");
		double pdiscount=sc.nextDouble();
		ProductDetails productDetails=new ProductDetails();
		productDetails.setpName(pname);
		productDetails.setpBrand(pbrand);
		productDetails.setpPrice(pprice);
		/* valueOf() return type Date
		 *Date,arg String*/;
		 productDetails.setpMFDate(Date.valueOf(pmdate));
		 productDetails.setpExDate(Date.valueOf(pexdate));
		 productDetails.setpQuantity(pquantuty);
		 productDetails.setpCategory(pcategory);
		 productDetails.setpDiscount(pdiscount);
		 productDAO.insertproductDetails(productDetails);
		 System.out.println("Admin added products successfully");
	}
	public void storeMultipleProductsByBrand() {
	    System.out.println("Enter brand name:");
	    String baseBrand = sc.next();

	    System.out.println("Enter how many products you want to add for this brand:");
	    int numberOfProducts = sc.nextInt();

	    List<ProductDetails> products = new ArrayList<>();

	    for (int i = 1; i <= numberOfProducts; i++) {
	        System.out.println("\n--- Enter details for product " + i + " ---");

	        System.out.println("Enter product name:");
	        String pname = sc.next();

	        System.out.println("Enter price:");
	        double pprice = sc.nextDouble();

	        System.out.println("Enter mf date (yyyy-mm-dd):");
	        String pmdate = sc.next();

	        System.out.println("Enter ex date (yyyy-mm-dd):");
	        String pexdate = sc.next();

	        System.out.println("Enter quantity:");
	        int pquantity = sc.nextInt();

	        System.out.println("Enter category:");
	        String pcategory = sc.next();

	        System.out.println("Enter discount:");
	        double pdiscount = sc.nextDouble();

	        ProductDetails productDetails = new ProductDetails();
	        productDetails.setpName(pname);
	        productDetails.setpPrice(pprice);
	        productDetails.setpMFDate(Date.valueOf(pmdate));
	        productDetails.setpExDate(Date.valueOf(pexdate));
	        productDetails.setpQuantity(pquantity);
	        productDetails.setpCategory(pcategory);
	        productDetails.setpDiscount(pdiscount);
	        products.add(productDetails);
	    }
	   if( productDAO.insertMultipleProductsByBrand(baseBrand, products))
	   {
		   System.out.println("Product inserted Succeesfully");
	   }
	}
	public List<ProductDetails> displayAllproducts() {
		
		//productDAO.selectAllProductDetails();
				List<ProductDetails>listofcproducts=productDAO.selectAllProductDetails();
				int i=1;
				for(ProductDetails p:listofcproducts)
				{
			    System.out.println("S.No : "+i+" Product details is ");
			    System.out.println("pname is "+p.getpName());
			    System.out.println("pprice is"+p.getpPrice());
			    System.out.println("pbrand is :"+p.getpBrand());
			    System.out.println("pMFDate is :"+p.getpMFDate());
			    System.out.println("pExDate is: "+p.getpExDate());
			    System.out.println("pCategory is :"+p.getpCategory());
			    System.out.println("pQuantity is :"+p.getpQuantity());
			    System.out.println("pdiscount is :"+p.getpDiscount());
			    System.out.println("============================");
			    i++;
			   }
				return listofcproducts;
	}


	}
