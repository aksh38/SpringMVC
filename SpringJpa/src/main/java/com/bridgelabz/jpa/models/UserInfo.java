package com.bridgelabz.jpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class UserInfo {

	@Id
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private String password2;
	private String mobilenum;

}
