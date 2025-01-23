package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_181 
{
	@Test
	public void google_assert()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India"+Keys.ENTER);
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com/");
		
	}
	

}
