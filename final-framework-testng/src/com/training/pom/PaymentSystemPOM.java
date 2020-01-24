package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PaymentSystemPOM
{
private WebDriver driver; 
	
	public PaymentSystemPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='memberUsername']")
private WebElement memberuser;

@FindBy(xpath="//input[@id='memberName']")
private WebElement fullname;

@FindBy(xpath="//tr[5]//td[1]//fieldset[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")
private WebElement submit;

@FindBy(xpath="//input[@id='amount']")
private WebElement amt;

@FindBy(xpath="//select[@id='type']")
private WebElement type;

@FindBy(xpath="//textarea[@id='description']")
private WebElement des;

@FindBy(xpath="//input[@id='submitButton']")
private WebElement submit1;

@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']")
private WebElement submit2;

public void memberuser(String mem){
	this.memberuser.sendKeys(mem);
}
	public void fullname(String fname){
		this.fullname.sendKeys(fname);
	}
	public void submit(){
		this.submit.click();
	}
	public void amount(String am){
		this.amt.sendKeys(am);
	}
	public void type(){
		Select type1=new Select(type);
		List<WebElement> list1=type1.getOptions();
		list1.get(1).click();
	}
	public void des(String desn){
		this.des.sendKeys(desn);
	}
	public void submit1(){
		this.submit1.click();
	}
	public void submit2(){
		this.submit2.click();
	}
	
}



