package seleniumSessions;

import java.net.URL;

public interface Util {
	
	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";
	
	public void navigateURL(String url);
	public void navigateURL(URL url);
	
	public String getPageTitle();
	
	public String getPageURL();
	
	public String getPageSource();
	
	public void closeBrowser();
	
	public void quitBrowser();

}
