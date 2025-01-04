package com.mycompany.pajeclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.testingUtilities.WebDriverUtils;

public class LoginPage extends BasePage {
	
	WebDriver driver = WebDriverUtils.getWebDriver();
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	
	public void doLogin(String username, String password) {
		type(usernameField, username);
		type(passwordField, password);
		
	}

	
	

}
