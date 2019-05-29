package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@TestInstance(Lifecycle.PER_CLASS)
class Basetest {
	
	private static WebDriver driver;
	private WebDriverWait wait;
	private String mainWinHandle;
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	protected WebDriverWait getWait() {
		return wait;
	}
	protected String getMainWinHandle() {
		return mainWinHandle;
	}
	
	@BeforeAll
     void login() throws Exception {
		driver=Configuration.createChrome();
		//driver=new HtmlUnitDriver(true);//enable javascript engine
		mainWinHandle=driver.getWindowHandle();//It is storing the mainWindow handle
		wait=new WebDriverWait(driver, Configuration.MAX_WAIT_TIME);
		
		
		//driver.manage().timeouts().implicitlyWait(Configuration.MAX_WAIT_TIME, TimeUnit.SECONDS);
		
		driver.get(Configuration.ADMIN_URL);
		
		//Thread.sleep(2000);
		
		
		//ExpectedCondition condition=ExpectedConditions.elementToBeClickable(By.id("user_login"));
		//wait.until(condition);
		//WebElement userTextBox=wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		
		WebElement userTextBox=SeleniumUtils.findElement(wait, By.id("user_login"));
		
		//WebElement userTextBox=driver.findElement(By.id("user_login"));
		SeleniumUtils.enterText(userTextBox, "User Name", Configuration.USER);
		SeleniumUtils.waitUntilCliclkable(wait,userTextBox);	
		//ExpectedCondition condition2=ExpectedConditions.elementToBeClickable(By.id("user_pass"));
		
		
		WebElement passwordField=SeleniumUtils.findElement(wait, By.id("user_pass"));
		  SeleniumUtils.enterText(passwordField, "Password", Configuration.PWD);
		  SeleniumUtils.waitUntilCliclkable(wait,passwordField);
		  
		// WebElement passwordField=wait.until(ExpectedConditions.elementToBeClickable(By.id("user_pass")));
       // WebElement passwordField=driver.findElement(By.id("user_pass"));
      
		
	
		passwordField.submit();
		
		//Thread.sleep(10000);
		
		
		
	}
	
	@AfterAll
	 void closeBrowser() {
		
		//driver.quit();
	}
	

}
