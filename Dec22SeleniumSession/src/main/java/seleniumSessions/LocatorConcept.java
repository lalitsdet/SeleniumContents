package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// Create Web Element (using locators) + actions(click, send keys , get text,isDisplayed)
		
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
	
	//WebElement email = driver.findElement(By.id("userId"));
//        
//		WebElement pwd =  driver.findElement(By.id("pass")); 
//		
//		email.sendKeys("lalitsingh447@gmail.com");
//		pwd.sendKeys("test@123");
		
		//3. By Locators
//		By email = By.id("userId");
//		By pwd   = By.id("pass");
//		
//		WebElement email_id =driver.findElement(email);
//		WebElement pwd_id = driver.findElement(pwd);
//		
//		email_id.sendKeys("lalitsingh447@gmail.com");
//		pwd_id.sendKeys("test@123");
		
		//4. By locator with generic method
//		By email = By.id("userId");
//    	By pwd   = By.id("pass");
//    	
//		getElement(email).sendKeys("lalitsingh447@gmail.com");
//		getElement(pwd).sendKeys("test@123");
		
		//5.By locator OR with a generic method: getElement() + actionmethod
//		By email = By.id("userId");
//        By pwd   = By.id("pass");
//        doSendKeys(email ,"lalitsingh447@gmail.com");
//        doSendKeys(pwd ,"test@123");
//		6.By locator OR with a generic method in Util class
//		By email = By.id("userId");
//		By pwd = By.id("pass");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(email, "lalitsingh447@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
		//7.String locator OR with generic methods in ElementUtil class
		String email_id = "userId";
		String pwd_id = "pass";
		doSendKeys(getBy("id", email_id),"lalitsingh447@gmail.com");
		doSendKeys(getBy("id", pwd_id),"test@123");
		
		
				
		
	}
	
	public static By getBy(String locatortype, String locatorvalue) {
		By locator = null;
		switch(locatortype) {
		case "id":
			locator = By.id(locatorvalue);
			break;
	    default:
	    	System.out.println("please pass the right locator...");
	    	break;
		}
		return locator;
		
	}
	
   public static  void doSendKeys(By locator  , String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
   public  static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	

}
