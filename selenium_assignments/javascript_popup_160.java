package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_popup_160{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement e1=driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	    driver.manage().window().maximize();
		

	}

}
