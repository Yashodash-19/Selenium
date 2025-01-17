package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_method_169 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/yasho/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		WebElement username =	driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("username");
	WebElement lastname=	driver.findElement(By.id("121"));
	if(lastname.isEnabled() && lastname.isDisplayed())
	{
		System.out.println("component is enable  " + lastname.isEnabled());
		System.out.println("conponent is diplayed  "+ lastname.isDisplayed());
		System.out.println("component is present");
	}
	else
	{
		System.out.println("component is enable  "  + lastname.isEnabled());
		System.out.println("conponent is diplayed  "+ lastname.isDisplayed());
		System.out.println("component is not present");
	}
	WebElement checkbox1=	driver.findElement(By.id("123"));
	if(checkbox1.isSelected()==false)
	{
		checkbox1.click();
	}
	
	}

}
