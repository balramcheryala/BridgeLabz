package com.bridgelabz.model;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Embeddable;

@Entity
@Table(name = "IPLTABLE")
@SuppressWarnings("serial")
public class Users implements Serializable {


	@Id
	@GeneratedValue
	@Column(name = "IpLID", length = 11 )
	private Long id;
	
	@Column(name = "IpLUname")
	String userName;

	@Column(name = "IpLPassword")
	String userPassword;
	@Column(name="IpLCpassword")
	String confirmPassword;
	@Column(name="IpLUemail")
	String email;
	@Column(name="IpLMobileNumb",nullable = false)
	String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	} 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}