package com.shopping.dto;

import java.io.Serializable;
//data transfer object....dto layer
//
public class AdminDetails  implements Serializable
{
	//Admin_Id, Admin_Email_Id, Admin_Password, Admin_Role
	private int aId;
	private String aEmail;
	private String aPassword;
	private String aRole;
	public AdminDetails()
	{
		
	}
	public AdminDetails(int aId, String aEmail, String aPassword, String aRole) {
		super();
		this.aId = aId;
		this.aEmail = aEmail;
		this.aPassword = aPassword;
		this.aRole = aRole;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	public String getaRole() {
		return aRole;
	}
	public void setaRole(String aRole) {
		this.aRole = aRole;
	}
	@Override
	public String toString() {
		return "AdminDetails [aId=" + aId + ", aEmail=" + aEmail + ", aPassword=" + aPassword + ", aRole=" + aRole
				+ "]";
	};
	public void displayAdmin()
	{
		System.out.println("Admin id is : "+getaId());
		System.out.println("Admin mail is : "+getaEmail());
		System.out.println("Admin password is : "+getaPassword());
		System.out.println("Admin role is : "+getaRole());

	}
}
