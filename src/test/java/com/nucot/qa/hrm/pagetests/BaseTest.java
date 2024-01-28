package com.nucot.qa.hrm.pagetests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.nucot.qa.hrm.driverfactory.DriverFactory;
import com.nucot.qa.hrm.pages.LoginPage;

public class BaseTest {
	
	
	DriverFactory df;
	WebDriver odriver;
	protected LoginPage  loginpage;
	Properties oprop;
	
	

	@BeforeTest
	void setup()
	{
		df=new DriverFactory();
		oprop=df.initProp();
		odriver=df.initDriver(oprop);
		
		loginpage=new LoginPage(odriver);
		
	}
	
	
	
	@AfterTest
	void closeApp()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	

}
