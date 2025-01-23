package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_Autosuggestion_163 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.name("q"));
	e1.sendKeys("id card");
	Thread.sleep(2000);
	List<WebElement> e2=	driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	Thread.sleep(2000);
	e2.get(e2.size()-5).click();
		

	}

}
