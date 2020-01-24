package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberloginPOM {
private WebDriver driver; 
	
	public MemberloginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='button' and @value='Submit']")
	private WebElement loginBtn; 
	

	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberUsername; 
	
	@FindBy(xpath="//*[@linkurl='accountOverview?memberId=13' and @value='Submit']")
	private WebElement accountinfo; 
	
	@FindBy(xpath="//select[@name='query(paymentFilter)']")
	private WebElement paymenttype; 
	
	@FindBy(xpath="//option[contains(text(),'Commission payments')]")
	private WebElement commission; 
	
	@FindBy(xpath="//*[@class='button' and @value='Search']")
	private WebElement Searching; 
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click(); 
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click(); 
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click(); ; 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click();
	
	}
	
	public void memberUsername(String mu)
	{
		this.memberUsername.sendKeys(mu);
		
	}
	
		public void account()
	{
		this.accountinfo.click();
		
	}
	
		public void payment()
		{
			this.paymenttype.click();
			
		}
		
		public void commissiontype()
		{
			this.commission.click();
			
		}
		
		
	 public void searchbutton()
	 {
		 this.Searching.click();
	 }


}
