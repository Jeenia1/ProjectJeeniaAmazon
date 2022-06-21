package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import utility.TmeUtils;

public class BaseAmazonClass {
	public static Properties prop = new Properties(); // using property method to read config.properties class
	public static WebDriver driver ; // globally decalaring driver
	
	public BaseAmazonClass() {     //Creating constructor of class to read properties of config.properties 
		try {
		FileInputStream file = new FileInputStream ("E:\\QA training software\\AmazonProject\\src\\test\\java\\enviornmentvariables\\Config.properties"); // reading config.properties file
		prop.load(file);	
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	//All common commands
	//defining browser preference 
		public static void initiate() {
	String browsername =	prop.getProperty("browser");
if(browsername.equals("Chrome")) {
	System.setProperty("Webdriver.ChromeDriver.driver", "ChromeDriver.exe");
	driver= new ChromeDriver(); }

	else if (browsername.equals("Firefox")) {
		System.setProperty("Webdriver.gecko.driver.driver", "geckodriver.exe");
		driver= new FirefoxDriver(); }
		
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(TmeUtils.timepage, TimeUnit.SECONDS);
driver.get(prop.getProperty("URL"));

	}
		// link to move to sign up page
		public void HelloSignin() {
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
			driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();	
		
}
		//move to sigin page
		public void HelloSignin1() {
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
			
			driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();	
		
		}
	//move to your accountscreen
		public void HelloSignYouraccount() {
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
			driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();	
		
		
		
		
		
}
}	
		


