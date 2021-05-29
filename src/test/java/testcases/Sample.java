package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void launchGoogle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\java\\executables\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		Assert.assertEquals(driver.getTitle(), "Gooasdgle");
	}
}
