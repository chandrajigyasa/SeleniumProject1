package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInfoPOM {
private WebDriver driver; 
	
	public AccountInfoPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//legend[contains(text(),'Accounts')]")
	private WebElement Accountslink;
	
	@FindBy(xpath="//*[@linkurl='accountOverview?memberId=12']")
	private WebElement Accountsinfo;
	
	@FindBy(xpath="//*[@class='view' and @transferid='61']")
	private WebElement transactionview;
	
	@FindBy(xpath="//input[@id='backButton']")
	private WebElement Back;
	
	public void submit(){
		this.submit();
	}
	
	public void Accounts()
	{
		this.Accountslink.click();
	}
	
	public void AccInfo()
	{
		this.Accountsinfo.click();
	}
	
	public void Transacview()
	{
		this.transactionview.click();
	}
	
	public void BackButton()
	{
		this.Back.click();
	}
}
	
