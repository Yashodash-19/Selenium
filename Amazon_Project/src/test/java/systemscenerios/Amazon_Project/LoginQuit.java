package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginQuit 
{
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
	
}
