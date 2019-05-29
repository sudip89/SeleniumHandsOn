package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	public static void printElemInfo(WebElement element) {
		String marker="-----------------------";
		System.out.println(marker);
		System.out.println("Element info");
		System.out.println(marker);
		System.out.println("Repr: "+element);
		System.out.println("Outer HTML: "+element.getAttribute("outerHTML"));
		System.out.println("Inner HTML: "+element.getAttribute("innerHTML"));
		System.out.println("Text: "+element.getText());
		System.out.println("Value: "+element.getAttribute("value"));
		System.out.println("Tag: "+element.getTagName());
		System.out.println("X,Y: "+element.getLocation());
		System.out.println("Displayed?: "+element.isDisplayed());
		System.out.println("Selected?: "+element.isSelected());
		System.out.println("Enabled?: "+element.isEnabled());
		System.out.println(marker);
		
	}
	
	public static void enterText(WebElement element, String name,  String text) throws Exception {
       	
		if(!element.isEnabled()) {
			throw new Exception(String.format("%s not enabled", name));
		}
		
		element.sendKeys(text);
		assertEquals(text, element.getAttribute("value"),String.format("Check correct %s entered.",name));
		
	}
	
	public static WebElement findElement(WebDriverWait wait, By by) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static void waitUntilCliclkable(WebDriverWait wait, WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}

}
