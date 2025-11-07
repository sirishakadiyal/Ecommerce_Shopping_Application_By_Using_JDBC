package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.AdminDetails;
import com.shopping.dto.CustomerDetails;
import com.shopping.util.JDBCConnection;

public class AdminDAO {
private static final String insert="insert into admin_details(Admin_Email_Id, Admin_Password, Admin_Role) values (?,?,?)";
private static final String selectDetails="Select * from admin_details";
private static final String admin_login="select * from admin_details where Admin_Email_Id=? and Admin_Password=?";

public boolean insertAdminDetails(AdminDetails admindetails)
{
		try {
			Connection connection=JDBCConnection.forMySQLConnection();
			PreparedStatement  preparedStatement =connection.prepareStatement(insert) ;
			preparedStatement.setString(1,admindetails.getaEmail());
			preparedStatement.setString(2,admindetails.getaPassword());
			preparedStatement.setString(3,admindetails.getaRole());
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

public List<AdminDetails> selectAllAdminDetails()
{
	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a14_e_commerce?user=root&password=root");
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(selectDetails);
		ResultSet resultSet=preparedStatement.executeQuery();
		List<AdminDetails> listofcustomers =new ArrayList<AdminDetails>();
		while(resultSet.next())
		{
			AdminDetails admindetails=new AdminDetails();
			admindetails.setaEmail(resultSet.getString("Admin_Email_Id"));
			admindetails.setaPassword(resultSet.getString("Admin_Password"));
			listofcustomers.add(admindetails);
		}
		return listofcustomers;
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
public boolean selectAdminDetailsByUsingEMailOrMobileNumberAndPassword(String email,String password)
{
	try {
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(admin_login);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
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
