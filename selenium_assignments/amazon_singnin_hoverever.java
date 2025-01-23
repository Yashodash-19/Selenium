package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_singnin_hoverever {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
	Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e2=	driver.findElement(By.xpath("//span[.='Sign in']"));
	a1.moveToElement(e2).perform();
	e2.click();
	

	}

}
