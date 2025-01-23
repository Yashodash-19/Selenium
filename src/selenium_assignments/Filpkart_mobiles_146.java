package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart_mobiles_146 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	WebElement w1=driver.findElement(By.name("q"));
	w1.sendKeys("mobiles");
	w1.sendKeys(Keys.ENTER);
		

	}

}
