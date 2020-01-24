package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.FilterTransactionPom;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class FilterTranscationTest {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private FilterTransactionPom filter;
//	private ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		filter=new FilterTransactionPom(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		
		driver.get(baseUrl);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void FilterTransactionPom() throws InterruptedException
	{
	filter.username("Aisha");
	//driver.findElement(By.xpath("//input[@id='cyclosPassword']")).click();
	driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
	driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[2]")).click();
	driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
	driver.findElement(By.xpath("//input[4]")).click();
	driver.findElement(By.xpath("//input[5]")).click();
	driver.findElement(By.xpath("//input[6]")).click();
	filter.loginBtn1();
	filter.account1();
	filter.accinfo();
	filter.advanced();
	filter.memberlogin1("Aisha");
	filter.fromaDate("05/03/2019");
	filter.todate("23/12/2020");
	filter.search123();
	filter.type(type);
  //	filter.type(type);
	//filter.todate("20/11/2020");
   // filter.
		
		//String actual=driver.findElement(By.xpath("//td[@class='tdHeaderTable']")).getText();
		//String expected="Successful payment";
		//Assert.assertEquals(actual, expected);
	}
	
	
}



