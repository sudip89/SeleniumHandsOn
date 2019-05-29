package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

class JTest {
	
	
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
    static void launchBrowser() {
		driver=Configuration.createChrome();	
	}
	
	@AfterAll
	static void closeBrowser() {
		
		//driver.quit();
	}
	
	@Test
	void test1() throws Exception {
		
		driver.get(Configuration.APP_URL);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement elementEmail=getDriver().findElement(By.id("email"));
		elementEmail.clear();
		elementEmail.sendKeys(Configuration.USER);
		Thread.sleep(1000);
		
		
		WebElement elementPass=getDriver().findElement(By.id("pass"));
		elementPass.clear();
		elementPass.sendKeys(Configuration.PWD);
		Thread.sleep(1000);
		
		
		WebElement elementSubmit=getDriver().findElement(By.id("loginbutton"));
		elementSubmit.click();
	    Thread.sleep(2000);
	    
	   	    
	    WebElement elementSearch=getDriver().findElement(By.xpath("//input[@data-testid='search_input']"));
	    elementSearch.sendKeys("Sudip");
	    
	    WebElement elementSearchBtn=getDriver().findElement(By.xpath("//button[@data-testid='facebar_search_button']"));
	    elementSearchBtn.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement elementPeople=getDriver().findElement(By.xpath("//div[text()='People']"));
	    elementPeople.click();
	    
	    Thread.sleep(3000);
	    
	    WebElement elementLocation=getDriver().findElement(By.xpath("//span[text()='Durgapur, West Bengal']"));
	    elementLocation.click();
	    
	    List<WebElement> elementFriendList = driver.findElements(By.cssSelector("#BrowseResultsContainer>div"));
	    for (WebElement element : elementFriendList) {
	       System.out.println(elementFriendList.size());  
	    }
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    
		
	}

	
	@Test
	void test2() {
		
		/*driver.get(Configuration.BLOG_URL);
		String expected="CSE Blog";
		String actual=driver.getTitle();
		assertEquals(expected, actual,"Check Page Title.");*/
		
	
	}
}
