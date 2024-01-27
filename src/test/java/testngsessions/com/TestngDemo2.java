package testngsessions.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo2 {
	
	
	
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("beforeSuite");
		
	}
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("beforeTest");
		
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("beforeClass");
		
	}
	
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("beforeMethod");
		
	}
	
	@Test
	void test1()
	{
		System.out.println("test1");
		
	}
	
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println("afterMethod");
		
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("afterClass");
		
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("afterTest");
		
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("afterSuite");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
