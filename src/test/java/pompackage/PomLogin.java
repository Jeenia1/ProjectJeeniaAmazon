package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomLogin extends BaseAmazonClass {

//object repository
//For Signup Page
@FindBy(css="#ap_customer_name")	
WebElement Signup_name;

@FindBy(css="#ap_email")	
WebElement Signup_email;


@FindBy(id="ap_password")	
WebElement Signup_password;

@FindBy(id="ap_password_check")	
WebElement Signup_confirmpassword;

@FindBy(css="#continue")	
WebElement Signup_continuebtn;


@FindBy( css= "#authportal-main-section > div:nth-child(2) > div > div > div > form > div > div:nth-child(7) > div > div > label > div > label > input[type=checkbox]")
WebElement keepmesignedin;

//For Signin page
@FindBy(css="#ap_email")
WebElement Email;
@FindBy(css ="#continue")
WebElement Sigin_continue;

@FindBy(id="ap_password") 
WebElement password;
@FindBy(css ="#signInSubmit")
WebElement Signin;

//Your Account
@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div")
WebElement yourorders;






//initialize the elemenets
public PomLogin() {
	
	PageFactory.initElements(driver, this);
}

//SIGNUP METHODS CALL
public void typeCname() {
	Signup_name.sendKeys("Maddy");
}

public void typeCemail() {
	Signup_email.sendKeys("maddyluke12340@gmail.com");
}
public void typeCnumber() {
	Signup_email.sendKeys("123456456");
}
public void typeCpassword() {
	Signup_password.sendKeys("Password123");
}
public void typeCpasswordless() {
	Signup_password.sendKeys("Pass");
}
public void typeCpasswordagain() {
	Signup_confirmpassword.sendKeys("Password123");
}
public void typeCpasswordagaindiff() {
	Signup_confirmpassword.sendKeys("Password13");}

public void ClickContinue() {
	Signup_continuebtn.click();
}

//Existing user
public void typeCnameExisting() {
	Signup_name.sendKeys("Jeenia");
}

public void typeCemailExisting() {
	Signup_email.sendKeys("jeenia.kaushal08@gmail.com");
}


//SIGNIN METHODS CALL
public void typeemail() {
	Email.sendKeys("jeenia.kaushal08@gmail.com");
}
public void typeemailinvalid() {
	Email.sendKeys("username@gail.co");}
public void clickSigninContinue() {
	Sigin_continue.click();
}
public void typepassword() {
	password.sendKeys("Jeenia@123");
}
public void typepasswordinvalid() {
	password.sendKeys("Jeenia@12");
}

public void Signinbtn() {
	Signin.click();

}
public String verify() {
	return driver.getTitle();
}


public void Keepmecheckbox() {
	keepmesignedin.click();
}



public void yourordersvalidate() {
	yourorders.click();
}



}

















