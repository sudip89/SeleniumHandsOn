package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

class IdentificationTest3 extends Basetest {

	@Test
	void test() throws Exception {
		JavascriptExecutor jsExec=(JavascriptExecutor)getDriver();
		jsExec.executeScript("document.getElementsByClassName('welcome-view-site')[0].click();");
			
		Thread.sleep(2000);
		getDriver().navigate().back();
		Thread.sleep(2000);
				
				
		//Pattern2
		WebElement element=getDriver().findElement(By.className("welcome-view-site"));
		jsExec.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		getDriver().navigate().back();
		Thread.sleep(2000);		
				
			
		//Pattern3
		WebElement element2=(WebElement) jsExec.executeScript("return document.getElementsByClassName('welcome-view-site')[0];");
		element2.click();
				
		
	}

}
