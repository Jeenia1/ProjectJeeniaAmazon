package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomLoginSecurity extends BaseAmazonClass {

	
	//loging_Securiy
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")
	WebElement login_Security;
	
	//Nameedit
	@FindBy(id="auth-cnep-edit-name-button")
	WebElement name;
	//updatename
	@FindBy(id="ap_customer_name")
	WebElement updatename;
	@FindBy(id="cnep_1C_submit_button")
	WebElement Save;
	
	//initialize the elemenets
		public pomLoginSecurity() {
			
			PageFactory.initElements(driver, this);
		}
	
	
//ALL Methods
//loging_Securiy
public void clickLoginSecurity(){
	login_Security.click();
	
}
//Nameedit
public void nameedit(){
	 name.click();
	
}
//update Nameedit
public void updatenameedit(){
updatename.sendKeys(" Kaushal");
	
}
//Save changes
public void Savechanges(){
	Save.click();
}
}