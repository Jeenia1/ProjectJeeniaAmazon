package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;

import pompackage.PomLogin;
import pompackage.PomYourAddress;
import pompackage.pomLoginSecurity;

public class LoginSecurityTest extends BaseAmazonClass{

	
	
	PomLogin log;
	pomLoginSecurity ls;
	
public LoginSecurityTest() {
		
		super();
}
		@BeforeMethod
		public void initsetup() {
			initiate();
			ls = new pomLoginSecurity();	
			log = new PomLogin();	
	}
		

		@Test (priority=1)
		public void loginSec() throws InterruptedException {
			//Amazon_TC43_vaild_Add information name etc
			
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
			
		    ls.clickLoginSecurity();
		    Thread.sleep(8000);
		   // Amazon_TC44_vaild_update information name cell phone number etc 
		    ls.nameedit();
		    Thread.sleep(2000);
		    ls.updatenameedit();
		    Thread.sleep(2000);
		    ls.Savechanges();
		    Thread.sleep(2000);

		
}@AfterMethod

public void driveclose() {
	driver.close();
}}
