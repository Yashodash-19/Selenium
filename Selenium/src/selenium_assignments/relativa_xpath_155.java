package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class relativa_xpath_155 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/yasho/Downloads/grotechminds.html");
		driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("(//input)[1]"));
	username.sendKeys("username");
	
	WebElement hint=driver.findElement(By.xpath("(//input)[2]"));
	hint.sendKeys("hint");	
	
	WebElement pwd=driver.findElement(By.xpath("(//input)[3]"));
	pwd.sendKeys("password");
	
	WebElement fname=driver.findElement(By.xpath("(//input)[4]"));
	fname.sendKeys("firstname");
	
	WebElement lname=driver.findElement(By.name("lname"));
		
		driver.executeScript("arguments[0].removeAttribute('disabled')", lname);
	lname.sendKeys("qwerty");
	
	//WebElement submit=driver.findElement(By.xpath("(//input)[6]"));
	//submit.click();
	
	WebElement boy=driver.findElement(By.xpath("(//input)[7]"));
	boy.click();
	
	
	WebElement girl=driver.findElement(By.xpath("(//input)[8]"));
	girl.click();
	
	WebElement baby=driver.findElement(By.xpath("(//input)[9]"));
	baby.click();
	
	//WebElement submit1=driver.findElement(By.xpath("(//input)[10]"));
	//submit1.click();
	
	WebElement male=driver.findElement(By.xpath("(//input)[11]"));
	male.click();
	WebElement female=driver.findElement(By.xpath("(//input)[12]"));
	female.click();
	WebElement relocate=driver.findElement(By.xpath("(//input)[13]"));
	relocate.click();
	//WebElement lets_know=driver.findElement(By.xpath("(//a)[1]"));
	//lets_know.click();
	WebElement relegion=driver.findElement(By.xpath("//select"));
	Select s1=new Select(relegion);
	s1.selectByIndex(2);
	WebElement signup=driver.findElement(By.xpath("//input)[14]"));
	signup.click();
	
	
	}

}
