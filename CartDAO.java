package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shopping.dto.CartDetails;
import com.shopping.util.JDBCConnection;

public class CartDAO {
String insert="insert into cart_details ( Product_Id, Customer_Id, Product_Quantity) values(?,?,?)";
public boolean insertCartDetails(CartDetails cartDetails)
{
	try {
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(insert);
		preparedStatement.setInt(1,cartDetails.getpId());
		preparedStatement.setInt(2,cartDetails.getcId());
		preparedStatement.setInt(3,cartDetails.getpQuantity());
		int result=preparedStatement.executeUpdate();
		if(result>0)
			return true;
		else
			return false;
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
}
