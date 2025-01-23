package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_hoverover_159 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.xpath("(//span[.='Fashion'] )[2]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=	driver.findElement(By.partialLinkText("Women Foot"));
		a1.moveToElement(e2).perform();
		WebElement e3=	driver.findElement(By.partialLinkText("Women Flats"));
		//e3.click();
		
		//Thread.sleep(3000);
		//WebElement e4=	driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		WebElement e4=	driver.findElement(By.xpath("(//span[.='Electronics'])[2]"));
		a1.moveToElement(e4).perform();
		WebElement e5=	driver.findElement(By.linkText("Cameras & Accessories"));
		a1.moveToElement(e5).perform();
		WebElement e6=	driver.findElement(By.linkText("Drone"));
		e6.click();
		
	}
	

}
