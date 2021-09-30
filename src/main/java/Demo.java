import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	// A template for a simple selenium test case


	public static void main(String[] args) {
		// write your selenium code here 

		//create driver object (chrome browser current) change to firefox(gecko) or IE as applicable
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "~/Downloads/webdriver/chromedriver.exe");
		driver.get("https://google.com");

		System.out.println(driver.getTitle()); 
		//			Validate if you are on correct URL
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();

		driver.get("https://www.dropbox.com/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//close current browser / or focused window
		//			driver.close();
		// close all browsers open by selenium / use when dealing with child windows
		//			driver.quit();
	}
}


