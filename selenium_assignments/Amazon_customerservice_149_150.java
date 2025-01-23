package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_customerservice_149_150 {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver ();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
	WebElement e1=	driver.findElement(By.linkText("Customer Service"));
	e1.click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();

	}

}
