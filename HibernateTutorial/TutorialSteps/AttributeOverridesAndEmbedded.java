package org.jiwan.hibernatetutorial.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
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
	// When multiple attributes are to be overriden.
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET") ),
			@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY") ),
			@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE") ),
			@AttributeOverride(name = "pincode", column = @Column(name = "HOME_PIN_CODE") ) })
	private Address homeAddress;
	private Address officeAddress;

	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
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
