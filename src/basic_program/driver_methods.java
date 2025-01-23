package basic_program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_methods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//launch the url
		driver.get("https://www.amazon.in/"); 
	//WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	//e1.sendKeys("Shoes" + Keys.ENTER);
		//gives title of page
	    String s1=	driver.getTitle();         
	    System.out.println(s1);
	    
	    Thread.sleep(3000);
	    //closes the parent tab/browser window or closes the tab/browser window which has control
		//driver.close();     
	    
	   //closes both parent and child tab/browser window
		//driver.quit();      
		
		//gives the parent window browser id  or gives the window browser id that has control
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		//gives the windows browser id for both parent and child
		
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
	}

}
