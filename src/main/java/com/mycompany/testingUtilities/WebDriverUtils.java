package com.mycompany.testingUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
	
	private static WebDriver driver;
	
	private WebDriverUtils() { //In Singleton we have to make constructor as private, so that 
		
	}
	
	
	public static WebDriver getWebDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chorme.driver", "./applicationone/src/test/resources/SeleniumDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
//	public static void main(String[] args) {
//		BasePage driver = new BasePage();
//		driver.getWebDriver().get("https://www.google.com");
//	}
	

}
