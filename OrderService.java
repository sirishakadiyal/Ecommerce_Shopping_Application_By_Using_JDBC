
	package com.shopping.service;

	import java.time.LocalDate;
	import java.util.Scanner;

	import com.shopping.dao.CustomerDAO;
	import com.shopping.dao.OrderDAO;
	import com.shopping.dto.CustomerDetails;
	import com.shopping.dto.OrderDetails;

	public class OrderService {
		OrderDetails orderDetails = new OrderDetails();
		CustomerDAO customerDAO = new CustomerDAO();
		
		OrderDAO orderDAO = new OrderDAO();
		//CustomerService customerService = new CustomerService();
		Scanner sc = new Scanner(System.in);
		public void addOrderDetails(int cId,int pId,int quantity)
		{
			CustomerDetails customerDetails = customerDAO.getCustomerById(pId);
			orderDetails.setcId(cId);
			orderDetails.setpId(pId);
			orderDetails.setpQuantity(quantity);
			System.out.println("Select Addresss to deliver the poduct:");
			String address1=customerDetails.getcAddress();
			String address2 = "Change Address";
			System.out.println(" 1."+address1+"\n 2."+address2);
			switch (sc.nextInt()) {
			case 1:
				System.out.println(address1);
				orderDetails.setoADdress(address1);
				break;
			case 2:
				System.out.println("Enter new address:");
				address2=sc.next();	
				orderDetails.setoADdress(address2);
				break;

			default:
				break;
			}
		//	orderDetails.set(LocalDate.now());
			if(orderDAO.insertOrderDetails(orderDetails))
			{
				System.out.println("Order details added successfully...");
			}
			else
				System.out.println("Server error 500...");
			System.out.println(orderDetails.toString());
		}
		

	
}
