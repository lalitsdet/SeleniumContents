package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver108\\r4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=KxAzV8-KEJPT8gfT0IWYAw");
		System.out.println(driver.getTitle());
		driver.close();
		//driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getTitle());
		int x;
		x=0;
	}

}
