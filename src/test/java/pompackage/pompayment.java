package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class pompayment extends BaseAmazonClass{

	
	
	//Your payments elements 
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
	WebElement paymentbtn;
	
	//click on add payment
	@FindBy(css="#pp-ajnLbF-33 > div > div > div.a-fixed-left-grid-col.apx-wallet-add-link-section.a-col-right")
	WebElement Apaymentbtn;
	//click on add debit or credit
	@FindBy(css="#pp-rJRKem-29 > span > input")
	WebElement Creditpaymentbtn;
		//add details of card number
		@FindBy(id="pp-Nds02h-15")
		WebElement cardno;
		//click on add debit or credit	
		@FindBy(id="pp-Nds02h-17")
		WebElement nameC;
	//Expiration date
		@FindBy(css="#pp-Nds02h-21 > span > span")
		WebElement month;
	
		@FindBy(css="#pp-Nds02h-21 > span > span")
		WebElement year;
	//Settings to deafult card
		@FindBy(css="#a-page > div:nth-child(33) > ul > div > li:nth-child(5) > span > a")
		WebElement Settingcard;
	//Preference method
		@FindBy(css="#cpefront-view-one-click-widget > div.a-box.a-spacing-none.pmts-portal-root-UEZGc3plmG1b.pmts-portal-component.pmts-portal-components-pp-5eMsuI-1 > div > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > a")
		WebElement preferencemethod;
		//search box
		@FindBy(id="twotabsearchtextbox")
		WebElement search;
	
	//initialize the elemenets
		public pompayment() {
		PageFactory.initElements(driver, this);
		}
	public void paymentbtnclick() {
		paymentbtn.click();
	}
	
	public void Addpaymentbtnclick() {
		Apaymentbtn.click();
	}
	
	
	public void optionspaymentbtnclick() {
		Creditpaymentbtn.click();
	}
	public void cardnumber() {
		cardno.sendKeys("5555555555554444");
	}
	public void nameoncard() {
		nameC.sendKeys("testing");
	}
	public void  monthday() {
		month.click();
	}
	public void  SelectionYear() {
		year.click();}
		public void  SelectionSettingscard() {
			Settingcard.click();
}public void  prefercard() {
	
 preferencemethod.click();
}
 public void  Searchbox() {


	 search.sendKeys("Samsung A20");
}}
