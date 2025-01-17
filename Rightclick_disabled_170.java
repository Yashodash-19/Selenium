package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rightclick_disabled_170 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	e1.click();

	WebElement e2=	driver.findElement(By.id("username"));
	e2.sendKeys("stbymkt");
	
	}
}
