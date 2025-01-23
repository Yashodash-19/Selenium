package DropDown_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
	    WebElement e1=	driver.findElement(By.id("Choice6"));
	    Select s1=new Select(e1);
	   // s1.selectByVisibleText("Night10");
		//s1.selectByIndex(10);
	    s1.selectByValue("Night10");
		
	}

}
