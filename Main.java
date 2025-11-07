package com.shopping.main;
//presentationlayer:user interacts with presentation layer
//presentation calls the service layer
//Service layer calls DAO 
//DAO interacts with database and returns database and rturns data
//DTO is passed back to the service ->presentation layer->User
import java.util.Scanner;

import com.shopping.service.AdminService;
import com.shopping.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerService c=new CustomerService();
        AdminService a=new AdminService();

//        String msg = "*** Welcome to A14_Shopping ***";7sf
//        for (int i = 0; i < msg.length(); i++) {
//            System.out.print(msg.charAt(i));
//            try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
//        }
//        System.out.println(); 
        boolean b = true;

        while (b) {
            System.out.println("Enter \n 1. Admin login \n 2. Customer Registration \n 3. Customer Login \n 4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Admin Menu");
                System.out.println("1. Register New Admin");
                System.out.println("2. Login as Admin");
                int adminChoice = sc.nextInt();
                if (adminChoice == 1) {
                    a.adminInsertion();   
                    } else if (adminChoice == 2) {
                    a.adminLogin();      
                } else {
                    System.out.println("Invalid choice");
                }
                break;


                case 2:
                    System.out.println("Customer registration");     
                   c.customerRegistration();
                    break;
                case 3:
                    System.out.println("Customer login");
                    c.customerLogin();
                    break;
//                case 4:
//                    System.out.println("Thank You");
//                    b = false;
//                    continue; 
                default:
                    System.out.println("Invalid Request");
                    continue; 
            }
            System.out.println("Do you want to continue? (Yes/No): ");
            String s = sc.next();

            if (!s.equalsIgnoreCase("Yes")) {
                b = false;
                System.out.println("Thank You");
            }
        }
     
        sc.close();
    }
}
