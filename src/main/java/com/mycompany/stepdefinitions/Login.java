package com.mycompany.stepdefinitions;

import com.mycompany.implementations.LoginPageImplementation;

import io.cucumber.java.en.Given;

public class Login {

	@Given("User is  on the login page")
	public void user_is_on_the_login_page() {
		LoginPageImplementation loginImpl = new LoginPageImplementation();
		loginImpl.login();
	}

	
	
}
