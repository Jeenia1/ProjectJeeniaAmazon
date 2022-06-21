package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Pomfilteration extends BaseAmazonClass{

	//search box
			@FindBy(id="twotabsearchtextbox")
			WebElement search;
	
			@FindBy(id="nav-search-submit-button")
			WebElement clicksearch;
	
	
	
	
	
	
	
	
//initialize the elemenets
public Pomfilteration() {
PageFactory.initElements(driver, this);
}
public void  Searchbox() {
   
	 search.sendKeys(prop.getProperty("search"));
     clicksearch.click();
     
     
     
     
     
     
}

}