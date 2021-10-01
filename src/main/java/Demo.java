import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {

	// A template for a simple selenium test case


	public static void main(String[] args) {
		// write your selenium code here 

		//create driver object (chrome browser current) change to firefox(gecko) or IE as applicable
		WebDriver driver = new FirefoxDriver();
		System.setProperty("WebDriver.gecko.driver", "~/Downloads/webdriver/geckodriver.exe");
//		driver.get("https://google.com");
//
//		System.out.println(driver.getTitle()); 
//		//			Validate if you are on correct URL
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();

		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement usernameElement = driver.findElement(By.id("email"));
		usernameElement.clear();
		usernameElement.sendKeys("xxx@email.com");
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.clear();
		passwordElement.sendKeys("password");
		WebElement forgotPasswordLinkElement = driver.findElement(By.linkText("Forgot Password?"));
		forgotPasswordLinkElement.click();
		//			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//close current browser / or focused window
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.close();
		// close all browsers open by selenium / use when dealing with child windows
//				driver.quit();
	}
}


