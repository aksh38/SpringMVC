package com.bridgelabz.jpa.models;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter

public class Login {

	private String username;
	private String password;
	
}
