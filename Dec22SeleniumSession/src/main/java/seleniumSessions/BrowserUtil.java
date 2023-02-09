package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util{
	
	public WebDriver driver;
	
	public WebDriver init_driver(String browser ) {
		
		// cross browser logic:
		System.out.println("browser name is " + browser);
		if(browser.equalsIgnoreCase(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase(SAFARI_BROWSER)) {
			
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser:" + browser);
		}
		
		return driver;
		
		
		
	}
	

	public static void main(String[] args) {
		
	}

	@Override
	public void navigateURL(String url) {
		if (url==null) {
			return;
		}
		
		if(url.isEmpty()) {
			return;
		}
		
		if(url.indexOf("http")==-1 || url.indexOf("https")==-1 ) {
			System.out.println("please enter the correct url,http(s) is missing..");
			return;
		}
		driver.get(url);
		
	}
    
	@Override
	public void navigateURL(URL url) {
		
		driver.navigate().to(url);
		
	}
	
	
	@Override
	public String  getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
		
	}

	@Override
	public String getPageURL() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
		
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

}
