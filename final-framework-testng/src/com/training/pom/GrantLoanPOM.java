package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrantLoanPOM {
	
@SuppressWarnings("unused")
private WebDriver driver; 
	
	public GrantLoanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//tr[8]//td[1]//fieldset[1]//table[1]//tbody[1]//tr[1]//td[4]//input[1]")
	private WebElement grantloan;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement amount;
	
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	

	@FindBy(xpath="//*[@class='button' and @value='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[@class='button' and @value='Submit']")
	private WebElement resubmit;
	
	public void grant()
	{
		this.grantloan.click();
	}
   public void Amt(String mon)
   {
	   this.amount.sendKeys(mon);
   }
   public void Descript(String de)
   {
	   this.description.sendKeys(de);
   }
   public void submit1()
   {
	   this.submit.click();
   }
   
   public void submit2()
   {
	   this.resubmit.click();
   }
}
