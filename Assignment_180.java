package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_180 
{
	@Test
	public void amazon()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	   WebElement un=	driver.findElement(By.name("email"));
	   un.sendKeys("yashodash19@gmail.com");
	   WebElement continue1=driver.findElement(By.id("continue"));
	   continue1.click();
	   WebElement pwd=driver.findElement(By.name("password"));
	   pwd.sendKeys("Shiva@123");
	   WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertEquals(search.isDisplayed(), true);
	}

}
