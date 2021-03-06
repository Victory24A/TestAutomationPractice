package com.QA.AP.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.QA.AP.pages.HomePage;
import com.QA.AP.pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	public void homePageTitleTest(){
		page.getInstance(LoginPage.class).doLogin("pvishal.2008@gmail.com", "Test@1010");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "My account - My Store");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest(){
		page.getInstance(LoginPage.class).doLogin("pvishal.2008@gmail.com", "Test@1010");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("home page header is: "+ header);
		Assert.assertEquals(header, "My account".toUpperCase());
	}
	
}
