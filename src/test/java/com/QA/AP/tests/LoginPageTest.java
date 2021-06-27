package com.QA.AP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.QA.AP.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	@Test(priority=1)
	public void verifyLoginPageTitleTest() throws Exception{
		Thread.sleep(2000);
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("login page title is: "+ title);
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=2)
	public void loginTest(){
		page.getInstance(LoginPage.class).doLogin("pvishal.2008@gmail.com", "Test@1010");
	}
	

}
