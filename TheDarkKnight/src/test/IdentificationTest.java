package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

class IdentificationTest extends Basetest {

	@Test
	void test() throws Exception {
		
	
		
	
		Set<Cookie> cookies=getDriver().manage().getCookies();
		List<Cookie> cks=new ArrayList<Cookie>();
		cks.addAll(cookies);
		
		Cookie cookie=cks.get(0);
		
		getDriver().manage().addCookie(cookie);
		getDriver().manage().deleteAllCookies();
		
		getDriver().navigate().refresh();
		
		
		
		
		
		
		
		
		
		
	}

}
