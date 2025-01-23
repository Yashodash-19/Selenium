package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1_152 {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Yashoda");
		
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();
		

	}

}
