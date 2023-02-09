package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

public class Amazontest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		br.init_driver("Chrome");
		//br.navigateURL("https://www.amazon.in/");
		br.navigateURL(new URL("https://www.amazon.in/"));
		String pagetitle = br.getPageTitle();
		System.out.println("Title of page is  " + pagetitle);
		
		if(pagetitle.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");	
		}
		System.out.println(br.getPageSource().contains("https://www.amazon.in/"));
		
		br.quitBrowser();
	}
	
    
}
