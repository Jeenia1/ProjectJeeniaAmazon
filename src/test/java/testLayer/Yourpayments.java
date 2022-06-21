package testLayer;

import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.pompayment;

public class Yourpayments extends BaseAmazonClass{

	
	
	pompayment pay;
	PomLogin log;
	
	public Yourpayments() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		 log = new PomLogin();
		
		pay = new pompayment();
	}
	@Test(priority=1)
	
	public void addcard() throws InterruptedException {
	

		log.HelloSignin1();
		Thread.sleep(2000);
		log.typeemail();
		
		Thread.sleep(2000);
		log.clickSigninContinue();
		Thread.sleep(2000);
		log.typepassword();
		Thread.sleep(2000);
		log.Signinbtn();
		Thread.sleep(2000);
		
		log.HelloSignYouraccount();
		Thread.sleep(3000);
	//Amazon_TC46_Valid_Add card
		
	   pay.paymentbtnclick();
	   Thread.sleep(3000);
     WebElement paymentButton = driver.findElement(By.linkText("Add a payment method"));;
	 Actions a = new Actions(driver);
	 a.moveToElement(paymentButton).click();
	 Thread.sleep(3000);

	  
	   pay.optionspaymentbtnclick();
	   Thread.sleep(3000);
	   pay.nameoncard();
	   Thread.sleep(3000);
	   pay.monthday();
	   Select b = new Select(driver.findElement(By.cssSelector("#pp-Nds02h-18_4")));
	   b.selectByVisibleText("05");
	   
	}
@Test(priority=2)
	
	public void defaultcard() throws InterruptedException {
	

		log.HelloSignin1();
		Thread.sleep(2000);
		log.typeemail();
		
		Thread.sleep(2000);
		log.clickSigninContinue();
		Thread.sleep(2000);
		log.typepassword();
		Thread.sleep(2000);
		log.Signinbtn();
		Thread.sleep(2000);
		
		log.HelloSignYouraccount();
		Thread.sleep(3000);
		 pay.paymentbtnclick();
		  Thread.sleep(3000);
		  pay.SelectionSettingscard();
		  Thread.sleep(3000);
		
		pay.prefercard();
		
		  Thread.sleep(3000);
	}
@Test(priority=3)

public void guest() throws InterruptedException {

	pay.Searchbox();
	driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(3000);
	String RESULTS = driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(8) > div > span > div > div > span")).getText();
	System.out.println(RESULTS);
	Assert.assertEquals(RESULTS,"RESULTS");
	System.out.println("Assertion Passed");

}

@AfterMethod

public void driveclose() {
	driver.close();
}}