package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search_158 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=	driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Grotechminds");
		search.sendKeys(Keys.ENTER);

	}

}
