package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterTransactionPom {
	WebDriver driver;
	public FilterTransactionPom(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cyclosUsername']")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Account')]")
	private WebElement account;
	
	@FindBy(xpath="//span[contains(text(),'Account Information')]")
	private WebElement accountinfo;
	
	@FindBy(xpath="//input[@id='modeButton']")
	private WebElement advanced;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberlogin;
	
    @FindBy(xpath="//tr[5]//td[2]//input[1]")
    private WebElement search;
    
    @FindBy(xpath="//*[@name='query(period).begin' and @id='_id1579506168962_52']")
    private WebElement fromdate;
    
    @FindBy(xpath="//*[@name='query(period).end' and @id='__id1579506168964_664']")
    private WebElement todate;
    
    
    @FindBy(xpath="//tr[5]//td[2]//input[1]")
    private WebElement search1;
    
    @FindBy(xpath="//select[@name='query(paymentFilter)']")
    private WebElement type;
    
    @FindBy(xpath="//tr[5]//td[2]//input[1]")
    private WebElement search2;
    
    public void username(String username){
    	this.userName.sendKeys(username);
    	}
    	
    	public void password1(String password){
    		this.password.sendKeys(password);
    	}
    	
    	public void loginBtn1(){
         this.loginBtn.click();
    	}
    	
    	public void account1(){
            this.account.click();
       	}
    	
    	public void accinfo(){
            this.accountinfo.click();
       	}
       
    	public void advanced(){
            this.advanced.click();
       	}
    	
    	public void memberlogin1(String mlogin){
            this.memberlogin.sendKeys(mlogin);
       	}

       	
 
    	public void search(){
            this.search();
       	}
    	
    	public void fromaDate(String dd){
            this.fromdate.sendKeys(dd);
           
       	}
    	
    	public void todate(String todate){
            this.todate.sendKeys(todate);
       	}
    	
    	public void search123(){
            this.search1.click();
       	}
    	
    	public void type(String type){
            this.type.sendKeys(type);
       	}
    	
    	public void search231(){
            this.search2.click();
       	}
    	
    	
    	
       	
       	
    	
    	
}
