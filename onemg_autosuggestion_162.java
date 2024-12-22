package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onemg_autosuggestion_162 {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.1mg.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("srchBarShwInfo"));
	e1.sendKeys("dolo");
	Thread.sleep(2000);
	List<WebElement> e2=	driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
	Thread.sleep(3000);
	e2.get(e2.size()-7).click();
		
	}

}
