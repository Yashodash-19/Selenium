package selenium_assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("id card");
	Thread.sleep(2000);
	List<WebElement> e2=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	Thread.sleep(2000);
//	e2.get(e2.size()-5).click();
	
	TakesScreenshot ts= driver;
File source=	ts.getScreenshotAs(OutputType.FILE);
File destination =new File("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Screenshot\\one"+ new Screenshot().getClass() +".png");

//File destination =new File("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Screenshot\\one"+Math.random() +".png");
FileHandler.copy(source, destination);
	
		
		

	}

}
