package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewLoansPOM {
private WebDriver driver; 
	
	public ViewLoansPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr[8]//td[1]//fieldset[1]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")
	private WebElement viewloan;
	
	@FindBy(xpath="//*[@name='query(status)' and @value='CLOSED']")
	private WebElement closed;
	
	
	@FindBy(xpath="//*[@name='query(status)' and @value='OPEN']")
	private WebElement opened;
	
	public void view()
	{
		this.viewloan.click();
	}
	
	public void close()
	{
		this.closed.click();
	}
	
	public void open()
	{
		this.opened.click();
	}
	
	
}



