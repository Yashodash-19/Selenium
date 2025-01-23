package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_autosuggetion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("id card");
	Thread.sleep(2000);
	List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	Thread.sleep(2000);
	e2.get(e2.size()-5).click();
	
	
			
	}

}
