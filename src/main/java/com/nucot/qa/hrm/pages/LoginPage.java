package com.nucot.qa.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver odriver;
	
	//1.Private By Locators:
	
	private By userName=By.xpath("//input[@name='username']");
	
	private By passWord=By.xpath("//input[@name='password']");
	
	private By loginBtn=By.xpath("//button[@type='submit']");
	
	
	//2.constructor
	
	public LoginPage(WebDriver odriver)
	{
		this.odriver=odriver;
		
	}
	
	
	//3.page actions/imple methods
	
	public String getLoginPageTile()
	{
			String title=odriver.getTitle();
			System.out.println("Login page tilte is--->"+title);
			return title;		
	}
	
	public String getLoginPageCurrentUrl()
	{	
		String url=odriver.getCurrentUrl();
		System.out.println("Login page Current url  is--->"+url);
		return url;
	}
	
	public void doLogin(String un,String pw)
	{

		odriver.findElement(userName).sendKeys(un);
		odriver.findElement(passWord).sendKeys(pw);
		odriver.findElement(loginBtn).click();
	
	}
	
	

}
