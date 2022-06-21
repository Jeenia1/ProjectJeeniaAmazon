package testLayer;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import pompackage.Pomfilteration;
import pompackage.pompayment;
public class Filteration extends BaseAmazonClass {

	Pomfilteration filter;
	PomLogin log;
	
	public Filteration() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		 log = new PomLogin();
		
		filter = new Pomfilteration();
		}
	
	@Test(priority=1)
	
	public void SortingFilter()  throws InterruptedException {
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
		
		filter.Searchbox();
		Thread.sleep(3000);
		
		//fetch all the price in list
	List<WebElement> priceElements =  driver.findElements(By.cssSelector("[class='a-price-whole']"));
	
	


	Map<WebElement, Integer> map= new HashMap<WebElement, Integer>();
	for (int i=0;i<priceElements.size();i++){
		
	
		map.put(priceElements.get(i), Integer.parseInt(priceElements.get(i).getText()));
		}
	    //Sorting
	List <Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		
		
		for (Entry e:le) {
			System.out.println(e.getValue());
		}
		//selecting by index lowest
		le.get(0).getKey().click();
		
		

	}


	@Test(priority=2)
	
	public void Sortingoptions()  throws InterruptedException {
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
		
		filter.Searchbox();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
		driver.findElement(By.id("s-result-sort-select_2")).click();
	
	
}@AfterMethod

public void driveclose() {
	driver.close();
}}
	
