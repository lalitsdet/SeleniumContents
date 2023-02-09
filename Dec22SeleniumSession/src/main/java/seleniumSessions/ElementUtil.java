package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil (WebDriver driver) {
		
		this.driver =driver;
	}
	
	
	
public  void doSendKeys(By locator  , String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
public  WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}

public  By getBy(String locatortype , String value) {
	 
	 By locator = null;
	 switch(locatortype) {
	 case "id":
		locator = By.id(value);
       break;
       
	 case "name":
			locator = By.name(value);
	       break;  
	       
	 case "className":
			locator = By.className(value);
	       break;  
	       
	 case "xpath":
			locator = By.xpath(value);
	       break;        
	 case "cssSelector":
			locator = By.cssSelector(value);
	       break; 
	 case "linktext":
			locator = By.linkText(value);
	       break;       
	 case "partialLinkText":
			locator = By.partialLinkText(value);
	       break;   
	 case "tagName":
			locator = By.tagName(value);
	       break;      
		
    default:
	   System.out.println("Please enter the correct locator type");
       break;
	
    
	
	}
	 return locator;   
 }


public  void doSendClick(By locator ) {
	
	getElement(locator).click();;
}

public String doGetElementText(By locator) {
	
	return driver.findElement(locator).getText();
	
}

}
