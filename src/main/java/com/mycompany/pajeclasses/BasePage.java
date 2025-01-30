package com.mycompany.pajeclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.After;
/*
 * In BasePage Super/Parent class we can have common methods which can be used
 * across the child classes*/
public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void click(WebElement button) {
		button.click();
	}
	
	public void type(WebElement usernameField, String text) {
		usernameField.sendKeys(text);
	}
	
	
	@After
	public void killBrowser() {
		driver.quit();
	}
	
	
	

}
