package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shopping.dto.OrderDetails;
import com.shopping.util.JDBCConnection;

public class OrderDAO {
private static final String insert="insert into order_details (Customer_Id, Product_Id, Product_Quantity, Order_Address, Order_Details ) values (?,?,?,?,?)";
public boolean insertOrderDetails(OrderDetails orderdetails)
{
		try {
			Connection connection=JDBCConnection.forMySQLConnection();
			PreparedStatement  preparedStatement =connection.prepareStatement(insert) ;
			preparedStatement.setInt(1,orderdetails.getcId());
			preparedStatement.setInt(2,orderdetails.getpId());
			preparedStatement.setInt(3,orderdetails.getpQuantity());
			preparedStatement.setString(3,orderdetails.getoADdress());
			preparedStatement.setString(4,orderdetails.getoDetails());
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
