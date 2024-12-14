package selenium_assignments;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_grotech_145 {

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	WebElement e1=driver.findElement(By.name("search_query"));
	e1.sendKeys("grotechminds") ;
	e1.sendKeys(Keys.ENTER);
	

	}

}
