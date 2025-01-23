package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Absoulte_Xpath_154 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/yasho/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		//WebElement firstname=	driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		//firstname.sendKeys("Manish");
		
		WebElement username =	driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("username");
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("qwerty");
		WebElement passwd=driver.findElement(By.xpath("(/html/body/input)[3]"));
		passwd.sendKeys("password");
		WebElement fname=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		fname.sendKeys("firstname");	
		//WebElement submit=driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
		//submit.click();
		WebElement boy=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		WebElement girl=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		girl.click();
		WebElement baby=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		baby.click();
		//WebElement submit1=	driver.findElement(By.xpath("((/html/body/form/)[2]/input)[4]"));
		//submit1.click();
		WebElement male=	driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		WebElement female=	driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		
		WebElement relocate=	driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		//WebElement click_to_know=	driver.findElement(By.partialLinkText("Click to know "));
		//click_to_know.click();
		
		WebElement relegion=	driver.findElement(By.xpath("/html/body/select"));
		Select s1=new Select(relegion);
		s1.selectByIndex(3);
		WebElement signup=	driver.findElement(By.xpath("(/html/body/input)[7]"));
		signup.click();	
		
		
	}

}
