package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Pomcart extends BaseAmazonClass{

	//search box
	@FindBy(id="twotabsearchtextbox")
	WebElement search;

	@FindBy(id="nav-search-submit-button")
	WebElement clicksearch;

	@FindBy(id="add-to-cart-button")
	WebElement addcart;

	@FindBy(id="nav-cart-icon nav-sprite")
	WebElement Maddcart;
	
	@FindBy(className="a-size-small sc-action-delete")
	WebElement delete;
	


//initialize the elemenets
public Pomcart() {
PageFactory.initElements(driver, this);
}
public void  Searchbox() {
	 search.sendKeys(prop.getProperty("search"));
clicksearch.click();
}

public void  addtocart() {
addcart.click();

}
public void  Mainaddtocart() {
Maddcart.click();

}public void  deletetemcart() {
delete.click();


}
}

