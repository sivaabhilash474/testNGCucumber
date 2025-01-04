package com.mycompany.stepdefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

public class Login {

	@Given("User is on the login page")
	public void login() {
		System.out.println("Logging into the application");
	}
	
	
}
