package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_xpath_157 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search=	driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		
	}

}
