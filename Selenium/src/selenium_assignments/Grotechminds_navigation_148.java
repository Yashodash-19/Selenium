package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_navigation_148 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.name("Skills"));
    e1.click();
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ENTER);
	

	}

}
