package test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {
	public static final String APP_URL = "https://www.facebook.com/";
	public static final String USER = "dr.sudip_roy@rediffmail.com";
	public static final String PWD = "Akcent12#";
	public static final long MAX_WAIT_TIME = 60;

	private static String ROOT_DIR=System.getProperty("user.dir")
			+File.separator;
	private static String DRIVERS_DIR=ROOT_DIR
			+"drivers"
			+File.separator;
	
	//private static String CHROME_PATH= DRIVERS_DIR+OSUtils.modifyNameForWindows("chromedriver");	
	//private static String FIREFOX_PATH= DRIVERS_DIR+OSUtils.modifyNameForWindows("geckodriver");	
	
	
	public static final String SCREENSHOTS_DIR=ROOT_DIR+"screenshots"+File.separator;
	private static String CHROME_PATH= getDriverPath("chromedriver");	
	private static String FIREFOX_PATH= getDriverPath("geckodriver");	
	
	public static String getSCreenShotFilePath(String name) {
		return SCREENSHOTS_DIR+System.currentTimeMillis()+"-"+ name+".png";
	}
	
		
			
	private static String getDriverPath(String driverName) {
		return DRIVERS_DIR + OSUtils.modifyNameForWindows(driverName);
	}

	public static WebDriver createChrome() {
		//Create prefs map to store all preferences 
	    Map<String, Object> prefs = new HashMap<String, Object>();

	    //Put this into prefs map to switch off browser notification
	    prefs.put("profile.default_content_setting_values.notifications", 2);

	    //Create chrome options to set this prefs
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("prefs", prefs);

	    //Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
	    //WebDriver driver = new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver", CHROME_PATH);
		return new ChromeDriver(options);
		
	}
	
	public static WebDriver createFirefox() {
		System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
		return new FirefoxDriver();
		
	}

}
