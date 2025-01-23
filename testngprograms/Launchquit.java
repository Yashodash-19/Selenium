package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launchquit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		driver= new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		
	}
 @AfterMethod
 public void quit() throws InterruptedException
 {
	 Thread.sleep(3000);
	 driver.quit();
 }
}
