package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.Pomcart;
import pompackage.Pomfilteration;

public class Cart extends BaseAmazonClass{

	

	Pomcart cart;
	PomLogin log;
	
	public Cart() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		 log = new PomLogin();
		
		cart = new Pomcart();
		}
	
	@Test
	
	public void addtocart()  throws InterruptedException {
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
	//add item to cart
		cart.Searchbox();
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(13) > div > div > div > div > div.a-section.a-spacing-small.s-padding-left-small.s-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")).click();
	cart.addtocart();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
 JavascriptExecutor js = (JavascriptExecutor)driver;
 WebElement Element = driver.findElement(By.id("nav-cart"));
 js.executeScript("arguments[0].scrollIntoView();",Element);
	Element.click();
	cart.deletetemcart();
	
}
@AfterMethod

public void driveclose() {
	driver.close();
}}


