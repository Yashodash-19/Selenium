package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_drop_down_153{

	public static void main(String[] args) throws InterruptedException 
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
	
WebElement e8=	driver.findElement(By.id("Skills"));
	
	Select s1=new Select(e8);
	s1.selectByIndex(1);
	
	WebElement e9=	driver.findElement(By.id("Country"));
	Select s2=new Select(e9);
	s2.selectByContainsVisibleText("India ");
	
	
	WebElement e5=driver.findElement(By.id("Present-Address"));
	e5.sendKeys("Bangalore");
	
	WebElement e6=driver.findElement(By.id("Permanent-Address"));
	e6.sendKeys("Naragund");
	WebElement e7=driver.findElement(By.id("Pincode"));
		e7.sendKeys("560066");
		
       
		WebElement e10=	driver.findElement(By.id("Relegion"));
		Select s3=new Select(e10);
		s3.selectByValue("Parsis");
		
		
	}

}
