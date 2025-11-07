package com.shopping.service;

import java.time.LocalDate;
import java.util.Scanner;

import com.shopping.dao.PaymentDAO;
import com.shopping.dto.PaymentDetails;

public class PaymentService {
	PaymentDetails paymentDetails=new PaymentDetails();
	PaymentDAO paymentDAO=new PaymentDAO();
	Scanner sc=new Scanner(System.in);
	public void paymentProcesingDetails(int cId,int pId, double amount)
	{
		System.out.println("Enter \n 1.UPI \n 2.cash on delivery \n 3. Debit \n 4.net payment \n 5.EMI");
		 switch(sc.nextInt())
		 {
		 case 1:paymentDetails.setPayType("UPI");
		        paymentDetails.setPayStatus("Payments successfull");
		        break;
		 case 2:paymentDetails.setPayType("cash on Delivery");
		        paymentDetails.setPayStatus("cash on delivery ");
		        break;
		 case 3:paymentDetails.setPayType("Debit");
		        paymentDetails.setPayStatus("Payments successfull");
                break;
		 case 4:paymentDetails.setPayType("net banking");
		        paymentDetails.setPayStatus("Payment successfull");
		        break;
		 case 5:paymentDetails.setPayType("EMI");
		        paymentDetails.setPayStatus("under processing");
		        break;
		 default:System.out.println("Invalid request");
		 break;
		 }
		 System.out.println("Enter AMount");
		 double amount1=sc.nextInt();
		 if(amount1==amount)
		 {
			 paymentDetails.setcId(cId);
			 paymentDetails.setPayDate(LocalDate.now());
			 paymentDetails.setpId(pId);
			 paymentDetails.setAmount(amount1);
			 if(paymentDAO.insertPaymentDetails(paymentDetails))
			 {
				 System.out.println("Payment setails inserted successfully");
			 }
			 else
				 System.out.println("no payments details are indertd");
		 }
		 else
		 {
			 System.out.println("Invalid amount");
		 }
	}
			
}
