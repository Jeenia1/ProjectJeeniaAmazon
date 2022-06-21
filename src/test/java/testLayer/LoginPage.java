package testLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;

public class LoginPage extends BaseAmazonClass {

PomLogin login;

public LoginPage() {
	
	super();
	
}	
@BeforeMethod
public void initsetup() {
	initiate();
	 login = new PomLogin();
	}
//Amazon_TC13_invalid_email
@Test (priority=1)
public void login1() throws InterruptedException {
	login.HelloSignin1();
	login.typeemailinvalid();
	Thread.sleep(2000);
	login.clickSigninContinue();
	
	String EmailError = driver.findElement(By.cssSelector("#auth-error-message-box > div > h4")).getText();
	System.out.println(EmailError);
	Assert.assertEquals(EmailError,"There was a problem");
	System.out.println("Assertion Passed");
	
}
	
//Amazon_TC14_Empty_email
@Test (priority=2)
public void login2() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.clickSigninContinue();
	
	String EmptyEmailError = driver.findElement(By.cssSelector("#auth-email-missing-alert > div > div")).getText();
	System.out.println(EmptyEmailError);
	Assert.assertEquals(EmptyEmailError ,"Enter your e-mail address or mobile phone number");
	System.out.println("Assertion Passed");
}
//Amazon_TC15_valid_email
@Test (priority=3)
public void login3() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.typeemail();
	Thread.sleep(2000);
	login.clickSigninContinue();
	
	String SuccessEmail = driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div > div > form > div > div.a-section.a-spacing-large > div.a-row > div.a-column.a-span5 > label")).getText();
	System.out.println(SuccessEmail);
	Assert.assertEquals(SuccessEmail,"Password");
	System.out.println("Assertion Passed");
}

//Amazon_TC16_valid_password and  Amazon_TC20_unchecked_Keep me signed  covered
@Test (priority=4)
public void login4() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.typeemail();
	Thread.sleep(2000);
	login.clickSigninContinue();
	login.typepassword();
	login.Signinbtn();
	Thread.sleep(2000);
	
	String actual= login.verify();
	System.out.println(actual);
	Assert.assertEquals(actual,"Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
}
//Amazon_TC17_invalid_password
@Test (priority=5)
public void login5() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.typeemail();
	Thread.sleep(2000);
	login.clickSigninContinue();
	login.typepasswordinvalid();
	login.Signinbtn();
	Thread.sleep(2000);
	
	
	String invalidpass = driver.findElement(By.cssSelector("#auth-error-message-box > div > div > ul > li > span")).getText();
	System.out.println(invalidpass);
	Assert.assertEquals(invalidpass,"Your password is incorrect");
	System.out.println("Assertion Passed");
}
//Amazon_TC18_empty_password

@Test (priority=6)
public void login6() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.typeemail();
	Thread.sleep(2000);
	login.clickSigninContinue();
	login.Signinbtn();
	Thread.sleep(2000);
	
	
	String emptypass = driver.findElement(By.cssSelector("#auth-password-missing-alert > div > div")).getText();
	System.out.println(emptypass);
	Assert.assertEquals(emptypass,"Enter your password");
	System.out.println("Assertion Passed");
}

//Amazon_TC19_checked_Keep me signed 

@Test (priority=7)
public void login7() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	login.typeemail();
	Thread.sleep(2000);
	login.clickSigninContinue();
	login.typepassword();
	login.Keepmecheckbox();
	
	
	login.Signinbtn();
	Thread.sleep(2000);
	
	
	String success= login.verify();
	System.out.println(success);
	Assert.assertEquals(success,"Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
}

//Amazon_TC21_Validate_Your account


@Test (priority=8)
public void login8() throws InterruptedException {
	login.HelloSignin1();
	Thread.sleep(2000);
	
}
@AfterMethod

public void close() {
	driver.close();
}
}