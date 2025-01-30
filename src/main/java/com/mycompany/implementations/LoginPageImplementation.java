package com.mycompany.implementations;

import org.openqa.selenium.WebDriver;

import com.mycompany.pajeclasses.LoginPage;
import com.mycompany.testingUtilities.WebDriverUtils;

public class LoginPageImplementation {
	
	WebDriver driver = WebDriverUtils.getWebDriver();
	
	public void login() {
			driver.get("https://thinking-tester-contact-list.herokuapp.com/");		
			LoginPage loginPage = new LoginPage(driver);
			loginPage.doLogin("test2223@gmail.com", "test@123");
	}


}
