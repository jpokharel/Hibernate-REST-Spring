package org.jiwan.hibernatetutorial.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId; // UserID is now taken as surrogate key and the system
						// AUTO generates its value
	private String userName;
	@ElementCollection
	private Set<Address> ListOfAddress=new HashSet<Address>();

	public Set<Address> getListOfAddress() {
		return ListOfAddress;
	}

	public void setListOfAddress(Set<Address> listOfAddress) {
		ListOfAddress = listOfAddress;
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
