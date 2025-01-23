package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class grotechmind_registration_147 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Yashoda");
		
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys("H");
		
	WebElement e3=driver.findElement(By.id("email"));
	e3.sendKeys("yashodash@gmail.com");
	
	WebElement e4=driver.findElement(By.id("password"));
	e4.sendKeys("qwetrty");
	
	WebElement e5=driver.findElement(By.id("Present-Address"));
	e5.sendKeys("Bangalore");
	
	WebElement e6=driver.findElement(By.id("Permanent-Address"));
	e6.sendKeys("Naragund");
	WebElement e7=driver.findElement(By.id("Pincode"));
		e7.sendKeys("560066");
	}

}
