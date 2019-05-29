package test;


import org.openqa.selenium.WebDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=Configuration.createFirefox();
		/*Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(Configuration.APP_URL);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		
		
		/*System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());*/
		
		//driver.get(Configuration.BLOG_URL);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle());
		
		String expectedTitle="CSE Blog1";
		String actualTitle=driver.getTitle();
		
		if(!expectedTitle.equals(actualTitle)) {
			String msg=String.format("Failure: Title does not match. Expected:<%s> Actual: <%s>", expectedTitle,actualTitle);
		/*	String msg="Failure: Title does not match. Expected:<"
					+expectedTitle
					+" >Actual: <"
					+actualTitle
					+">";*/
			throw new Exception(msg);
		}
		
		
		driver.quit();
	}

}
