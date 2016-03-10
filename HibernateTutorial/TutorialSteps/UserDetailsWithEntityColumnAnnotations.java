package org.jiwan.hibernatetutorial.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_DETAILS")
public class UserDetails {

	@Id
	@Column (name="User_Id")
	private int userId;
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	@Column(name="User_Name")
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
