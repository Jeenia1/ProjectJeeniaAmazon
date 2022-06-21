package testLayer;

import static org.testng.Assert.assertEquals;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.PomYourAddress;

public class Your_Address extends BaseAmazonClass{

	PomYourAddress YourAdd;
	PomLogin  login;
	public Your_Address() {
		
		super();
		
	}	
	@BeforeMethod
	public void initsetup() {
		initiate();
		YourAdd = new PomYourAddress();	
		login = new PomLogin();	
}
	
	@Test (priority=1)
	public void address() throws InterruptedException {
		//Amazon_TC27_Validate_your addresses
		YourAdd.HelloSignin1();
		Thread.sleep(2000);
		login.typeemail();
		Thread.sleep(2000);
		login.clickSigninContinue();
		login.typepassword();
		login.Signinbtn();
		Thread.sleep(2000);
		YourAdd.HelloSignYouraccount();
		Thread.sleep(2000);
		//clicking on your addresses
	    YourAdd.youraddressbtn();
	    //Clicking on "+" icon
	    Thread.sleep(2000);
	    YourAdd.youraddressaddbtn();
	    Thread.sleep(2000);
	//Amazon_TC28_Valid_add address_country
	    String a =  YourAdd.defaultcountry();
	    Assert.assertEquals(a,"Canada");
	    System.out.println("1. By Default Region selected - Canada - Assertion Passed");
	 //Amazon_TC29_invalid_add address_Full Name 
	    YourAdd.save();
	    String ErrorNameMsg =  YourAdd.Efullname();
	    Assert.assertEquals(ErrorNameMsg, "Please enter a name.");
	    Thread.sleep(2000);
	    System.out.println("2.Error message of blank name is " + ErrorNameMsg);
	    Thread.sleep(2000);
	    
	  //Amazon_TC34_Empty_add address_Address
	    String BlankAddress = YourAdd.adrressblankE();
	    Assert.assertEquals(BlankAddress, "Please enter an address.");
	    Thread.sleep(2000);
	    System.out.println("3.Error message of blank address is " + BlankAddress);
	    Thread.sleep(2000);
	  
	  //Amazon_TC33_Empty_add address_phone number  
	    String Blankphone = YourAdd.EPhonenumber();
	    Assert.assertEquals(Blankphone, "Please enter a phone number so we can call if there are any issues with delivery.");
	    Thread.sleep(2000);
	    System.out.println("4.Error message of blank phone number is " + Blankphone);
	    
	    
	
	  //Amazon_TC30_valid_add address_Full Name
	    Thread.sleep(2000);
	    YourAdd.Vfullname();
	    Thread.sleep(2000);
	    
	  //Amazon_TC32_invalid_add address_phone number
	    YourAdd.IVphonenumber();
	    String invalid = YourAdd.IVErrorphonenumber();
	   String Expect =" Please enter a valid phone number";
	   SoftAssert softAssert = new SoftAssert();
	   softAssert.assertEquals(invalid,Expect );
	   System.out.println("5.User error message for (Please enter a valid phone number) - " + invalid);
	   Thread.sleep(2000);
	   
	  // Amazon_TC33_Empty_add address_phone number 
	    driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).clear();
	    Thread.sleep(2000);
	    YourAdd.save();
	    Thread.sleep(2000);
	   
	    
	  //Amazon_TC31_valid_add address_phone number
	   YourAdd.Vphonenumber();
	   Thread.sleep(2000);
	  //Amazon_TC35_vaild_add address_Address
	   YourAdd.Vadrressenter();
	   Thread.sleep(2000);
	   //city
	   YourAdd.city();
	   Thread.sleep(2000);
	   //Amazon_TC38_invaild_add address_POSTAL CODE
	   
	  
	   String invalidcode = YourAdd.IVEpostalcode();
		Thread.sleep(2000);
	   
	   SoftAssert softinvalidcode = new SoftAssert();
	   String validcode = "Please enter a valid code";
	   softinvalidcode.assertEquals(invalidcode,validcode );
	   System.out.println("6.User error message for (Please enter a valid code) - " + invalid);
	   Thread.sleep(2000);
	   //Amazon_TC36_vaild_add address_Province
	   driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span")).click();
	   driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")).click();
	   Thread.sleep(2000);
	   
	   //Amazon_TC37_vaild_add address_POSTAL CODE
	   YourAdd.Vpostalcode();
	   
	   
	   //Amazon_TC39_vaild_add address_make address as default
	   WebElement checkbox = driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressFormContainer > div.a-checkbox.address-ui-widgets-checkbox-view.a-spacing-medium > label > span > span"));
	   checkbox.click();
	   Thread.sleep(2000);
	   System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
	   Thread.sleep(2000);
	   //Add preferences, notes, access codes and more
	   YourAdd.prefresnceexpand();
	  Thread.sleep(2000);
	   YourAdd.businessc();

	   YourAdd.save();
	   Thread.sleep(2000);
	
	
	
	
}@AfterMethod

public void driveclose() {
	driver.close();
}}
