package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept_part2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		//Launch application
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
//		By name = By.name("firstname");
//		By lastName = By.name("lastname");
//		
//		ElementUtil ele1 = new ElementUtil(driver);
//		ele1.doSendKeys(name, "Lalit");
//		ele1.doSendKeys(lastName, "Singh");
		
		//1.id
		//2.Name
	   //3.className	
	   //4.xpath: is locator (address of the element in the DOM)-- but it not attribute
		//*[@id="form-register"]/div/div/button
//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"form-login\"]/button");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Lalit");;
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Singh");;
//		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
//		doSendKeys(emailId, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doSendClick(loginBtn);
		
		//5.css selector:is a locator but its not a attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#form-login > button")).click();
		
		//6.Linktext
		//driver.findElement(By.linkText("Register")).click();
		//7 Partial linktext for partial links
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//8 Tag name
		String tagName = driver.findElement(By.tagName("h2")).getText();
		System.out.println(tagName);
	}


	
	

}
