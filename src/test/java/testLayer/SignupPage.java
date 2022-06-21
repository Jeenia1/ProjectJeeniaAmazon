package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;

public class SignupPage extends BaseAmazonClass{
	PomLogin log;
	public SignupPage() {
	super();
	
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		 log = new PomLogin();
		
	}
	//TC00 - To verify Website open or not - working

	@Test (priority=1)
	public void Title() {
		String actual= log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual,"Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	//Amazon_TC1_valid_yourname and  Amazon_TC9_valid_Password again
	@Test (priority=2)
	public void Signup1() throws InterruptedException {
		log.HelloSignin();
		log.typeCname();
		log.typeCemail();
		log.typeCpassword();
		log.typeCpasswordagain();
		Thread.sleep(2000);
		log.ClickContinue();
	
		String Text = driver.findElement(By.cssSelector("#verification-code-form > div:nth-child(11) > div.a-row.a-spacing-micro.cvf-widget-input-code-label")).getText();
		System.out.println(Text);
		Assert.assertEquals(Text,"Enter OTP");

	}
	//Amazon_TC2_Empty_yourname
	@Test (priority=3)
	
	public void Signup2 () throws InterruptedException {
		log.HelloSignin();
		Thread.sleep(2000);
		log.ClickContinue();
		String Error = driver.findElement(By.cssSelector("#auth-customerName-missing-alert > div > div")).getText();
		System.out.println(Error);
		Assert.assertEquals(Error,"Enter your name");
		System.out.println("Assertion Passed");
}

	 //	Amazon_TC3_Empty_Mobile number or email
	@Test (priority=4)
	
	public void Signup3 () throws InterruptedException {
		log.HelloSignin();
		Thread.sleep(2000);
		log.ClickContinue();
		
	 String ErrorEM = driver.findElement(By.cssSelector("#auth-email-missing-alert > div > div")).getText();
	 System.out.println(ErrorEM);
	 Assert.assertEquals(ErrorEM,"Enter your e-mail address or mobile phone number");
	 System.out.println("Assertion Passed");
	}
	
	//Amazon_TC4_valid_Partial Mobile number 
	@Test (priority=5)
	
	public void Signup4 () throws InterruptedException {
		log.HelloSignin();
		Thread.sleep(2000);
		log.typeCnumber();
		log.ClickContinue();
		
	WebElement verifyM = driver.findElement(By.cssSelector("#continue"));
	 System.out.println(verifyM);
	 Assert.assertEquals(true,verifyM.isDisplayed());
	 System.out.println("Verify mobile number");
	}

	//Amazon_TC5_valid_Partial email
@Test (priority=6)
	
	public void Signup5 () throws InterruptedException {
		log.HelloSignin();
		Thread.sleep(2000);
		log.typeCemail();
		log.ClickContinue();
		
	WebElement verifyE = driver.findElement(By.cssSelector("#continue"));
	 System.out.println(verifyE);
	 Assert.assertEquals(true,verifyE.isDisplayed());
	System.out.println("Verify Email");

	}
//Amazon_TC6_valid_Password _6 or more characters
	
@Test (priority=7)

public void Signup6 () throws InterruptedException {
	log.HelloSignin();
	Thread.sleep(2000);
	log.typeCname();
	log.typeCemail();
	log.typeCpassword();
	log.typeCpasswordagain();
	log.ClickContinue();
	
	String Text = driver.findElement(By.cssSelector("#verification-code-form > div:nth-child(11) > div.a-row.a-spacing-micro.cvf-widget-input-code-label")).getText();
	System.out.println(Text);
	Assert.assertEquals(Text,"Enter OTP");
	System.out.println("Assertion Passed");
}
//Amazon_TC7_invalid_Password _5 or less characters
@Test (priority=8)	
public void Signup7 () throws InterruptedException {
	log.HelloSignin();
	Thread.sleep(2000);
	log.typeCname();
	log.typeCemail();
	log.typeCpasswordless();
	log.ClickContinue();
	
	String MinPass = driver.findElement(By.cssSelector("#auth-password-invalid-password-alert > div > div")).getText();
	System.out.println(MinPass);
	Assert.assertEquals(MinPass,"Minimum 6 characters required");
	System.out.println("Minimum 6 characters required - Assertion Passed");
}
	
//Amazon_TC8_invalid_Password again
@Test (priority=9)	
public void Signup8() throws InterruptedException {
	log.HelloSignin();
	Thread.sleep(2000);
	log.typeCname();
	log.typeCemail();
	log.typeCpassword();
	log.typeCpasswordagaindiff();
	log.ClickContinue();
	
	String MinPass = driver.findElement(By.cssSelector("#auth-password-mismatch-alert > div > div")).getText();
	System.out.println(MinPass);
	Assert.assertEquals(MinPass,"Passwords do not match");
	System.out.println("Passwords do not match - Assertion Passed");
}

//Amazon_TC10_valid_existing account

@Test (priority=10)	
public void Signup9() throws InterruptedException {
	log.HelloSignin();
	Thread.sleep(2000);
	log.typeCnameExisting();
	log.typeCemailExisting();
	log.typeCpassword();
	log.typeCpasswordagain();
	log.ClickContinue();
	
	String ExistingUser = driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div:nth-child(2) > h4:nth-child(1)")).getText();
	System.out.println(ExistingUser);
	Assert.assertEquals(ExistingUser,"Are you a returning customer?");
	System.out.println("Are you a returning customer? - Assertion passed");

}




@AfterClass
public void close() {
	driver.close();
}}