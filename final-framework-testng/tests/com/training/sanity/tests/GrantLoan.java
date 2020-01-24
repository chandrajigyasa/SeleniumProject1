package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.GrantLoanPOM;
import com.training.pom.MemberloginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GrantLoan {
	private WebDriver driver;
	private String baseUrl;
	//private MemberLoginPOM MemberloginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private MemberloginPOM memberloginPOM;
	//private PaymentSystemPOM paymentystemPOM;
	//private PaymentSystemPOM paymentsystemPOM;
	private GrantLoanPOM grantloanPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	 memberloginPOM = new MemberloginPOM(driver); 
	 grantloanPOM =new GrantLoanPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000); 
		driver.quit();
	}
	@Test
	public void systemPaymentTest() {
		memberloginPOM.sendUserName("admin");
		memberloginPOM.sendPassword("password");
		memberloginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		 memberloginPOM.memberUsername("Aisha");
		 grantloanPOM.grant();
		 grantloanPOM.Amt("100000");
		 grantloanPOM.Descript("home loan");
		 grantloanPOM.submit1();
		 grantloanPOM.submit2();
		 
			Alert alert1=driver.switchTo().alert();
			alert1.accept();
			
			String actual=driver.findElement(By.xpath("//span[@class='menuText'][contains(text(),'Accounts')]")).getText();
			String expected="Accounts";
			Assert.assertEquals(actual, expected);
/* String actualvalue=driver.findElement(By.xpath("//*[contains(text(),'You are about to grant the following loan:')]")).getText();
	     String expectedvalue="You are about to grant the following loan:";
	     Assert.assertEquals(actualvalue, expectedvalue);
			System.out.println(actualvalue); */
		 
		 
	
	}
}

