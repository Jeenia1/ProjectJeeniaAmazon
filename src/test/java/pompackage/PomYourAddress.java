package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomYourAddress extends BaseAmazonClass {

    //youraddress btn
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div")
	WebElement youraddress;
	 
	//youraddress  addbtn
	@FindBy(css="#ya-myab-plus-address-icon")
	WebElement addbtn;
	
	//full name - valid
		@FindBy(id= "address-ui-widgets-enterAddressFullName")
		WebElement Validfullname;
	//phone number- valid
		@FindBy(id= "address-ui-widgets-enterAddressPhoneNumber")
		WebElement Validphonenumber;	
		
		
		
	//canada country by default
	@FindBy(css="#address-ui-widgets-countryCode > span > span")
	WebElement country;
	//Save btn
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input")
	WebElement savebtn;
	
	//Address -valid enter
		@FindBy(id="address-ui-widgets-enterAddressLine1")
		WebElement Validaddress;
		
	//Address - Error message
	@FindBy(css="#address-ui-widgets-enterAddressFormContainer > div:nth-child(10) > div > div:nth-child(10) > div > div > div > div > div")
	WebElement Erroraddress;
	
	//full name - Error message
	@FindBy(css="#address-ui-widgets-enterAddressFormContainer > div:nth-child(10) > div > div:nth-child(4) > div > div > div > div > div")
		WebElement Errorfullname;
	
	
	//Phone number - invalid Error messgae
		@FindBy(css= "#address-ui-widgets-enterAddressFormContainer > div:nth-child(10) > div > div:nth-child(6) > div > div > div > div > div ")
		WebElement IVphonenumber;
	
	//Phone number- Empty Error message
	@FindBy(css="#address-ui-widgets-enterAddressFormContainer > div:nth-child(10) > div > div:nth-child(6) > div > div > div > div > div")
	WebElement ErrorPhonenumber;
	//city
	@FindBy(id= "address-ui-widgets-enterAddressCity")
	WebElement vcity;
	
	//Postal code 

	@FindBy(id= "address-ui-widgets-enterAddressPostalCode")
	WebElement Postalcode;
	
	//Invalid Postal code  error
	
		@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[7]/div/div[16]/div/div[1]/div/div/div")
		WebElement IVEPostal;
	
	//Element -Youraddress- Business code
	@FindBy(xpath="//*[@id=\"address-ui-widgets-delivery-instructions-desktop-widget-html-container\"]/div/div/div[1]/div[1]/span/div/span[3]/span/button")
	WebElement business;
	
	//Element for Delievry insrutctions
	@FindBy(css="#address-ui-widgets-enterAddressFormContainer > div.a-row.a-expander-container.a-expander-inline-container.address-ui-widgets-desktop-delivery-instructions-expander > a > span > span")
	WebElement expand;


	
	
	
	
	
	
//initialize the elemenets
	public PomYourAddress() {
		
		PageFactory.initElements(driver, this);
	}
//youraddress btn
public void youraddressbtn() {
	youraddress.click();}

//youraddress add btn
public void  youraddressaddbtn() {
	addbtn.click();}
//defaultcountry - canada
public String defaultcountry() {
	return country.getText();}

//save btn 
public void save() {
	savebtn.click();}
//fullname valid
public void Vfullname() {
	 Validfullname.sendKeys("abc");}
//fullname error
public String Efullname() {
	return Errorfullname.getText();}
//Phone number - valid
public void Vphonenumber() {
	Validphonenumber.sendKeys("123456789");
	}
//Phone number - invalid number
public void IVphonenumber() {
	Validphonenumber.sendKeys("abcdf");
	}
//Phone number error - Invalid
public String IVErrorphonenumber() {
	return IVphonenumber.getText();}

//Phone number error - empty
public String EPhonenumber() {
	return ErrorPhonenumber.getText();}
//Address- valid enter
public void Vadrressenter() {
	Validaddress.sendKeys("85 Jane st");}

//Address error
public String adrressblankE() {
	return Erroraddress.getText();}
//Valid city
public void city() {
	 vcity.sendKeys("Scarborough");}
//Valid valid POSTAl code
public void Vpostalcode() {
	Postalcode.sendKeys("M3b 1R6");}
// inavlid POSTAl code
public void IVpostalcode() {
	Postalcode.sendKeys("12365478");}
//Phone number error - invalidcode
public String IVEpostalcode() {
	return IVEPostal.getText();}

//Your address methods
public void businessc() {
	business.click();
}
//preference for Delievry insrutctions
public void prefresnceexpand() {
	
	expand.click();
}}