package com.nucot.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nucot.qa.hrm.constants.ApplicationConstants;

public class LoginPageTest extends BaseTest{
	

	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String actualTitle=loginpage.getLoginPageTile();
		
		//validation point
		Assert.assertEquals(actualTitle,ApplicationConstants.LOGIN_PAGE_TITLE);
		
		
	}
	
	@Test(priority=2)
	public void loginPageCurrentUrlTest()
	{
		String actualUrl=loginpage.getLoginPageCurrentUrl();
		
		//validation point
		Assert.assertEquals(actualUrl,ApplicationConstants.LOGIN_PAGE_CURRENTURL);
		
	}
	
	@Test(priority=3)
	public void doLoginPageTest() throws InterruptedException
	{
		Thread.sleep(3000);
		loginpage.doLogin(oprop.getProperty("username"), oprop.getProperty("password"));
		
	}
	
	
	
	
	
	
	
	
	

}
