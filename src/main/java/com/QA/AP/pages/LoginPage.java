package com.QA.AP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	By emailId = By.id("email");
	By password = By.id("passwd");
	By loginButton = By.id("SubmitLogin");
	By nextButton = By.xpath("//span[text()='Next']");

	
	//page actions:
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void doLogin(String username, String pwd){
		doSendKeys(emailId, username);
		doSendKeys(password, pwd);
		doClick(loginButton);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
