package testcases;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample 
{
	WebDriver	driver=null;
	
	
	
	
	@BeforeMethod
	public void precondition(){
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\java\\executables\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		
	}
	@Test(groups="Smoke")
	public void launchGoogle() throws InterruptedException
	{
	
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}
	
	@Test(groups="Regression")
	public void openFacebook() throws InterruptedException{
		
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		driver.findElement(By.id("email")).sendKeys("Prashant");
		driver.findElement(By.id("pass")).sendKeys("Chavan");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterMethod
	public void postCondition(){
		driver.quit();
	}
}
