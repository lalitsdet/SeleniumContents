package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.google.com/");
      System.out.println(driver.getTitle());
      
     // driver.navigate().to("https://www.amazon.com/");
      try {
		driver.navigate().to(new URL("https://www.amazon.com/"));
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      System.out.println(driver.getTitle());
      
      driver.navigate().back();
      System.out.println(driver.getTitle());
      
      driver.navigate().forward();
      System.out.println(driver.getTitle());
      
      driver.navigate().back();
      System.out.println(driver.getTitle());
      
      driver.navigate().refresh();

	}

}
