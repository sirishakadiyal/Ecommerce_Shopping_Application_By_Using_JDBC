package com.shopping.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shopping.dto.PaymentDetails;
import com.shopping.util.JDBCConnection;

public class PaymentDAO {
private static final String insert="insert into payment_details(Customer_Id, Product_Id, Payment_Status, Amount, Payment_Date,Payment_Type) values(?,?,?,?,?,?)";
public boolean insertPaymentDetails(PaymentDetails paymentdetails)
{
		try {
			Connection connection=JDBCConnection.forMySQLConnection();
			PreparedStatement  preparedStatement =connection.prepareStatement(insert) ;
			preparedStatement.setInt(1,paymentdetails.getcId());
			preparedStatement.setInt(2,paymentdetails.getpId());
			preparedStatement.setString(3,paymentdetails.getPayStatus());
			preparedStatement.setDouble(4,paymentdetails.getAmount());
		    Date date=Date.valueOf(paymentdetails.getPayDate());
			preparedStatement.setString(6,paymentdetails.getPayType());
			int res=preparedStatement.executeUpdate();
			if(res!=0)
			{
				return true;
			}
			else
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
}
}
