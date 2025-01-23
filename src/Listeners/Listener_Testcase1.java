package Listeners;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener1.class)
public class Listener_Testcase1 extends Listener1
{
	
	@Test
	public void amazonaddtocart() throws InterruptedException
	{
		 driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		search_box.sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement mobile=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height'][1]"));
		mobile.click();
	Set<String> pcid=driver.getWindowHandles();
	       Iterator<String> pc= pcid.iterator();
	       String parentid  =  pc.next();
	       System.out.println(parentid);
	       String childid=pc.next();
	       System.out.println(childid);
	       driver.switchTo().window(childid);
	       
	       Thread.sleep(8000);
	     WebElement addtocart=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	     addtocart.click();
	     Thread.sleep(5000);
	 WebElement proceed=      driver.findElement(By.xpath("(//span[@class='a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button'])[1]"));
	 proceed.click();
	 Thread.sleep(5000);
	WebElement email= driver.findElement(By.name("email"));
	 email.sendKeys("yashodash19@gmail.com");
	 WebElement continue1=driver.findElement(By.id("continue"));
	 continue1.click();
	 Thread.sleep(2000);
	 WebElement password= driver.findElement(By.name("password"));
	 password.sendKeys("Shiva@123");
	 WebElement signin=driver.findElement(By.id("signInSubmit"));
	 signin.click();
	 WebElement radionbtn=driver.findElement(By.xpath("(//input[@name='submissionURL'])[10]"));
	 radionbtn.click();
	 WebElement address=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
	 address.click();
	 Thread.sleep(5000);
	 //WebElement payment=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[5]"));
	 WebElement payment=driver.findElement(By.xpath("(//manish[@name='ppw-instrumentRowSelection'])[5]"));
	payment.click();
	
	}
	

}
