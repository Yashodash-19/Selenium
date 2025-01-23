package selenium_assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart_addtocart_popup_164 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Flipkart.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	

	WebElement e3=	driver.findElement(By.xpath("//input[@name='q']"));
	e3.sendKeys("shoes"+Keys.ENTER);
	WebElement e4=	driver.findElement(By.xpath("//a[@class='rPDeLR'][1]"));
	e4.click();
	Set<String> pcid=driver.getWindowHandles();
	System.out.println(pcid);
    Iterator<String> pc=	pcid.iterator();
    String parentid=pc.next();
    String child1=pc.next();
	driver.switchTo().window(child1);
	Thread.sleep(5000);
	WebElement e5=	driver.findElement(By.xpath("//li[@class='col col-6-12 ']"));
     //WebElement e5=	driver.findElement(By.id("add-to-cart-button"));
	Thread.sleep(8000);
	e5.click(); 
	WebElement e6=	driver.findElement(By.xpath("//span[.='Place Order']"));
	Thread.sleep(5000);
    e6.click();
  WebElement e7=  driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']"));
    e7.sendKeys(Private.phno);
    WebElement e8=  driver.findElement(By.xpath("//span[.='CONTINUE']"));
    e8.click();
    Scanner s1=new Scanner(System.in);
	System.out.println("Enter OTP: ");
	String OTP=s1.next();
	WebElement OTP_textbox=driver.findElement(By.xpath("//input[@class='r4vIwl zgwPDa Jr-g+f']"));
	OTP_textbox.sendKeys(OTP +Keys.ENTER);
	//Thread.sleep(10000);
	
	WebElement address=	driver.findElement(By.xpath("//button[.='Deliver Here']"));
	address.click();
	WebElement continue1=	driver.findElement(By.xpath("//button[.='CONTINUE']"));
	continue1.click();
	WebElement phonepay=	driver.findElement(By.xpath("(//div[@class='qsHXPi'])[3]"));
	phonepay.click();
	Thread.sleep(5000);
	WebElement continue2=	driver.findElement(By.xpath("//button[.='CONTINUE']"));
	continue2.click();
	}

}
