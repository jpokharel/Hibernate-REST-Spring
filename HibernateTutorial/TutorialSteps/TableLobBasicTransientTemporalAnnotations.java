package org.jiwan.hibernatetutorial.dto;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

	@Id
	private int userId;
	//Ignores the UserName field and is not stored in database
	@Transient
	private String userName;
	//Implements hi-bernate to SQL default data type conversion.
	@Basic
	private String address;
	//Only DATE is extracted from current date.
	@Temporal(TemporalType.DATE)  
	private Date dateJoined;
	//To allow database to store large objects CLOB or BLOB.
	@Lob
	private String description;
	
	  
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	  
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserId() {
		return userId;
	}
	
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
