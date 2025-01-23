package testngprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_182 
{
	@Test
	public void amazon_search()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes"+Keys.ENTER);
		List<WebElement> e1=driver.findElements(By.xpath("(//div[@class='s-image-padding'])[1]"));
	int i=	e1.size();
	System.out.println(i);
	Assert.assertEquals(e1.size()>50, true);
		
	}

}
