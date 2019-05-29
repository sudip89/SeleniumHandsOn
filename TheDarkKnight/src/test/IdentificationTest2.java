package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class IdentificationTest2 extends Basetest {

	@Test
	void test() {
		
				//SeleniumUtils.findElement(getWait(), By.linkText("Settings")).click();
				
				SeleniumUtils.findElement(getWait(), By.linkText("Posts")).click();
				SeleniumUtils.findElement(getWait(), By.linkText("Categories")).click();
				
				
				//List<WebElement> checkboxes=getDriver().findElements(By.name("delete_tags[]"));
				
				
				WebElement div=getDriver().findElement(By.className("tablenav"));
				
				WebElement elements=getDriver().findElement(By.id("doaction"));
				System.out.println(elements.getAttribute("value"));
				
				
				
				/*System.out.println(checkboxes.size());
				if(checkboxes.size()==0) {
					throw new NoSuchElementException("Selenium did not find element with....");
				}
				
				for(WebElement checkbox:checkboxes) {
					checkbox.click();
					assertTrue(checkbox.isSelected());
				}
				*/
				
				/*WebElement startOfWeek=SeleniumUtils.findElement(getWait(), By.id("start_of_week"));
				String expectedDay="Thursday";
				Select dropDown=new Select(startOfWeek);
				dropDown.selectByVisibleText(expectedDay);
				
				String actualDay=dropDown.getFirstSelectedOption().getText();
				
				assertEquals(expectedDay, actualDay);*/
				
				/*startOfWeek.click();
				
				startOfWeek.sendKeys(expectedDay);
				
				WebElement option=SeleniumUtils.findElement(getWait(), By.xpath("//option[text()='Thrusday']"));*/
				/*SeleniumUtils.waitUntilCliclkable(getWait(), option);
				option.click();*/
				
				//assertTrue(option.isSelected());
				
				
		
	}

}
