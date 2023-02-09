package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	//webdriver :automation library/tool	-- only for web automation
	//test client -- TestNg -- test cases--java 
	//cross browser -- firefox ,chrome 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver108\\chromedriver.exe");
		
		// Automation steps:
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title  = driver.getTitle();
		System.out.println(title);
		
		//validation/checkpoints
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is not correct !!");
		}
		
		// Automation steps (selenium) + validation (java)
		
		driver.quit(); // close the driver

	}

}
