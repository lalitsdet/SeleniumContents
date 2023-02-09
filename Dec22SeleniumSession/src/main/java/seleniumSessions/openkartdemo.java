package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openkartdemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		//Launch application
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
//		By firstName = By.id("input-firstname");
//		By lastName  = By.id("input-lastname");
		
//		WebElement first_ele  = driver.findElement(firstName);
//		first_ele.sendKeys("Lalit");
//		WebElement last_ele  = driver.findElement(lastName);
//		last_ele.sendKeys("Singh");
		
		
		
		//4.By Locator with generic method
//		WebElement first_ele  = getElement(firstName);
//     	first_ele.sendKeys("Lalit");
//		WebElement last_ele  = getElement(lastName);
//    	last_ele.sendKeys("Singh");
		
		//5.By locator with generic method : getElement() + actions method
//		By firstName = By.id("input-firstname");
//		By lastName  = By.id("input-lastname");
//		
//		doSendKeys(firstName, "Lalit");
//		doSendKeys(lastName, "Singh");
		
		//6.By locator OR  with generic method in ElementUtil class
//		By firstName = By.id("input-firstname");
//		By lastName  = By.id("input-lastname");
//		ElementUtil ele = new ElementUtil(driver);
//		ele.doSendKeys(firstName,"Lalit");
//		ele.doSendKeys(lastName,"Singh");	
		
		//7.String locator with generic method in Element Util class
		String firstName = "input-firstname";
		String lastName = "input-lastname";
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(ele.getBy("id",firstName),"Lalit");
		ele.doSendKeys(ele.getBy("id",lastName),"Singh");
				
					
		}
	
	  
	  
}
		
		
		
	
	


