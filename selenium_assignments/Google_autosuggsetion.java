package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_autosuggsetion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.name("q"));
	e1.sendKeys("india");
	Thread.sleep(2000);
List<WebElement> e2=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
e2.get(5).click();
		
	

}
}
