package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;

public class Your_account extends BaseAmazonClass {

	
	PomLogin Youraccount;

	public Your_account() {
		
		super();
		
	}	
	@BeforeMethod
	public void initsetup() {
		initiate();
		Youraccount = new PomLogin();	
}
	
//Amazon_TC21_Validate_Your account

	@Test (priority=1)
	public void account() throws InterruptedException {
		
		Youraccount.HelloSignYouraccount();
		Thread.sleep(2000);
		
		String VaildateyourA= driver.findElement(By.cssSelector("#a-page > div.a-container > div > div.a-row.a-spacing-base > h1")).getText();
		System.out.println(VaildateyourA);
		Assert.assertEquals(VaildateyourA,"Your Account");
		System.out.println("Your Accoun validation - Assertion Passed");}
	//Opening your orders
		
	//Amazon_TC22_Validate_Your Orders //Amazon_TC23_Validate_Your Orders options
		@Test (priority=2)
		public void order() throws InterruptedException {	
		Youraccount.HelloSignin1();
		
		Thread.sleep(2000);
		Youraccount.typeemail();
		Thread.sleep(2000);
		Youraccount.clickSigninContinue();
		Youraccount.typepassword();
		Youraccount.Signinbtn();
		Thread.sleep(2000);
		
		Youraccount.HelloSignYouraccount();
		Thread.sleep(2000);
		
		Youraccount.yourordersvalidate();
		Thread.sleep(2000);
	
		//driver.findElement(By.cssSelector("#a-autoid-1-announce")).click();
		//Thread.sleep(2000);
		//Select drop = new Select(driver.findElement(By.cssSelector("#a-autoid-1-announce")));
		//drop.selectByIndex(3);
		
	
		//Amazon_TC24_Validate_Buy Again
		
		driver.findElement(By.cssSelector("#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//Amazon_TC25_Validate_Not yet Shipped
		driver.findElement(By.cssSelector("#CardInstanceZMqxF5M2_RVhneJDxbSjww > div > div:nth-child(3) > ul > li:nth-child(3) > span > a")).click();
		System.out.println(driver.getTitle());
		//Amazon_TC26_Validate_Cancelled 
		driver.findElement(By.cssSelector("#orderTypeMenuContainer > ul > li:nth-child(5) > span > a")).click();
		System.out.println(driver.getTitle());
		String cancelorder= driver.findElement(By.cssSelector("#controlsContainer > div.a-row.a-spacing-base.top-controls > label")).getText();
		Assert.assertEquals(cancelorder,"1 cancelled order placed in the last 6 months");
		System.out.println("1 cancelled order placed in the last 6 months - Assertion Passed");}
	
@AfterMethod

public void driveclose() {
	driver.close();
}}