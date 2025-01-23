package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class grotechminds_Autosuggestion_161{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.grotechminds.com/blogs");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.name("phrase"));
	e1.sendKeys("selenium");
	Thread.sleep(8000);
	List<WebElement> e2=	driver.findElements(By.xpath("(//div[@class='results'])[2]/div/div"));
	//Thread.sleep(5000);
	int count=e2.size();
	System.out.println(count);
	e2.get(3).click();
		

	}

}
