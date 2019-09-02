package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invokebrower {
	public WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium java workspace\\practiseproject\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}

}
