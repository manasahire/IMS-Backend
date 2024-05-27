package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="signup2405")
public class signUp {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private long signupId;
	@Column(length=25)
	private String fullName;
	@Column(length=25)
	private String email;
	@Column(length=15)
	private String password;
	@Column(length=12) 
	private String mobileNumber;
	@Column(length=12) 
	private String profession;
	
	
	
	
}
