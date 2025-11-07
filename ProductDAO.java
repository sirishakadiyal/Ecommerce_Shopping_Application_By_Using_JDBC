package com.shopping.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dto.ProductDetails;
import com.shopping.util.JDBCConnection;

public class ProductDAO {
	private static final String insert="insert into product_details(Product_Name, Product_Brand, Product_Price, Product_M_F_Date, Product_Ex_Date, Product_Quantity, Product_Category, Product_Discount) values(?,?,?,?,?,?,?,?)";
    private static final String selectDetails="select * from product_details";
	public boolean insertproductDetails(ProductDetails productdetails)
{
	try {
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(insert);
		//ResultSet resultSet=preparedStatement.executeQuery();
		preparedStatement.setString(1, productdetails.getpName());
		preparedStatement.setString(2,productdetails.getpBrand());
		preparedStatement.setDouble(3,productdetails.getpPrice());
		preparedStatement.setDate(4,(Date) productdetails.getpMFDate());
		preparedStatement.setDate(5,(Date) productdetails.getpExDate());
		preparedStatement.setInt(6, productdetails.getpQuantity());
		preparedStatement.setString(7, productdetails.getpCategory());
		preparedStatement.setDouble(8,productdetails.getpDiscount());
		int res=preparedStatement.executeUpdate();
		if(res!=0)
		{
			return true;
		}
		else
		return false;
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
	public boolean insertMultipleProductsByBrand(String baseBrand, List<ProductDetails> products) {
	    try {
	        for (ProductDetails product : products) {
	            // Fix the brand as baseBrand for all
	            product.setpBrand(baseBrand);
	            insertproductDetails(product);
	        }
	        //System.out.println(products.size() + " products inserted for brand: " + baseBrand);
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

public List<ProductDetails> selectAllProductDetails()
{
	try {
		Connection connection=JDBCConnection.forMySQLConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(selectDetails);
		ResultSet resultSet=preparedStatement.executeQuery();
		List<ProductDetails> listofproductdetails=new ArrayList<ProductDetails>();
		if(resultSet.isBeforeFirst())
		{
		while(resultSet.next())
		{
			ProductDetails productDetails=new ProductDetails();
			productDetails.setpId(resultSet.getInt("Product_Id"));
			productDetails.setpName(resultSet.getString("Product_Name"));
			productDetails.setpBrand(resultSet.getString("Product_Brand"));
			productDetails.setpPrice(resultSet.getDouble("Product_Price"));
			productDetails.setpMFDate(resultSet.getDate("Product_M_F_Date"));
			productDetails.setpExDate(resultSet.getDate("Product_Ex_Date"));
			productDetails.setpCategory(resultSet.getString("Product_Category"));
			productDetails.setpQuantity(resultSet.getInt("Product_Quantity"));
			productDetails.setpDiscount(resultSet.getDouble("Product_Discount"));
			listofproductdetails.add(productDetails);
		}
		
		return listofproductdetails;
		}
		else
		{
			return null;
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
}
