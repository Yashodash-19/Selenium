package selenium_assignments;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Date_166 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	
	
Date d1=new Date();
String humantime=	d1.toString();
String month=humantime.substring(4, 7);
String date=humantime.substring(8, 10);
String year=humantime.substring(24);
String time=humantime.substring(11, 19).replace(":", "-");
String date1=month+date+year+" "+time;

TakesScreenshot ts= driver;
File source=	ts.getScreenshotAs(OutputType.FILE);
Thread.sleep(5000);
File destination1 =new File("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Screenshot\\one"+ new Screenshot_Date_166().getClass() + date1 +".png");
Thread.sleep(5000);
FileHandler.copy(source, destination1);
	}
}