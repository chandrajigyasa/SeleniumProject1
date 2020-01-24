package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
import com.training.pom.PaymentSystemPOM;
import com.training.pom.ViewLoansPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ViewLoans {

	private WebDriver driver;
	private String baseUrl;
	//private MemberLoginPOM MemberloginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private MemberloginPOM memberloginPOM;
	private PaymentSystemPOM paymentystemPOM;
	private PaymentSystemPOM paymentsystemPOM;
	private GrantLoanPOM grantloanPOM;
	private ViewLoansPOM viewloansPOM;

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
	 viewloansPOM =new ViewLoansPOM(driver);
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
		 
		 viewloansPOM.view();
		 viewloansPOM.close();
		 viewloansPOM.open();
		 
		 String actualvalue=driver.findElement(By.xpath("//td[contains(text(),'Search results')]")).getText();
	     String expectedvalue="Search results";
	     Assert.assertEquals(actualvalue, expectedvalue);
			System.out.println(actualvalue); 
		 
	}
	
}

