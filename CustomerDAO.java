package com.shopping.dao;
//db operations
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.CustomerDetails;
import com.shopping.util.JDBCConnection;

public class CustomerDAO {
private static final String insert="insert into customer_details(Customer_Name, Customer_Email_Id, Customer_Mobile_Number, Customer_Address, Customer_Gender, Customer_Password) values(?,?,?,?,?,?)";
private static final String selectDetails="select* from customer_details";
private static final String customer_login="select * from customer_details where (Customer_Email_Id=? or Customer_Mobile_Number=?) and Customer_Password=?";
private static final String selectUsingId = "select * from customer_details where Customer_Id = ?";

public boolean insertCustomerDetails(CustomerDetails customerDetails)
{
	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a14_e_commerce?user=root&password=root");
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement  preparedStatement =connection.prepareStatement(insert) ;
		preparedStatement.setInt(1, customerDetails.getcId());
		preparedStatement.setString(1,customerDetails.getcName());
		preparedStatement.setString(2,customerDetails.getCEmail());
		preparedStatement.setLong(3,customerDetails.getcMbNum());
		preparedStatement.setString(4,customerDetails.getcAddress());
		preparedStatement.setString(5,customerDetails.getcGender());
		preparedStatement.setString(6,customerDetails.getcPassword());
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
public List<CustomerDetails> selectAllCustomerDetails()
{
	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a14_e_commerce?user=root&password=root");
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(selectDetails);
		ResultSet resultSet=preparedStatement.executeQuery();
		List<CustomerDetails> listofcustomers =new ArrayList<CustomerDetails>();
		while(resultSet.next())
		{
			CustomerDetails customerDetails=new CustomerDetails();
			customerDetails.setcEmail(resultSet.getString("Customer_Email_Id"));
			customerDetails.setcMbNum(resultSet.getLong("Customer_Mobile_Number"));
			customerDetails.setcPassword(resultSet.getString("Customer_Password"));
			customerDetails.setcId(resultSet.getInt("Customer_Id"));
			customerDetails.setcAddress(resultSet.getString("Customer_Address"));
			customerDetails.setcGender(resultSet.getString("Customer_Gender"));
			customerDetails.setcName(resultSet.getString("Customer_Name"));
			listofcustomers.add(customerDetails);
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
public CustomerDetails selectCustomerDetailsByUsingEMailOrMobileNumberAndPassword(String emailOrmobilenumber,String password)
{
	try {
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(customer_login);
		preparedStatement.setString(1, emailOrmobilenumber);
		preparedStatement.setString(2, emailOrmobilenumber);
		preparedStatement.setString(3, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			CustomerDetails cust=new CustomerDetails();
			cust.setcId(resultSet.getInt("Customer_Id"));
			cust.setcEmail(resultSet.getString("Customer_Email_Id"));
            cust.setcMbNum(resultSet.getLong("Customer_Mobile_Number"));
            cust.setcPassword(resultSet.getString("Customer_Password"));
            cust.setcName(resultSet.getString("Customer_Name"));
            cust.setcGender(resultSet.getString("Customer_Gender"));
            return cust;
		}
		else
			return null;
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
public CustomerDetails getCustomerById(int customerId) {
    CustomerDetails customer = null;
    try {
        Connection connection = JDBCConnection.forMySQLConnection();
        PreparedStatement ps = connection.prepareStatement(selectUsingId);
        ps.setInt(1, customerId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            customer = new CustomerDetails();
            customer.setcId(rs.getInt("Customer_Id"));
            customer.setcAddress(rs.getString("Customer_Address"));
            customer.setcEmail(rs.getString("Customer_Email_Id"));
            customer.setcMbNum(rs.getLong("Customer_MobileNo")); // ✅ fixed
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return customer;
}

}
