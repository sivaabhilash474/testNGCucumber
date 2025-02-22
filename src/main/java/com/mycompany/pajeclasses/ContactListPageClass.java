package com.mycompany.pajeclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListPageClass extends BasePage{
	
	public ContactListPageClass() {

	}
	
	
	public ContactListPageClass(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="body > div > header > h1")
	WebElement pageHeading;
	
	public void validateContactHeading() {
	validatePageHeading(pageHeading, "ContactPage");
	}
	
}
