package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_183 
{
	@Test
	public void amazon_signin_assert()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D728858856234%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10449932477655786978%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061994%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2409549%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.id("ap_email"));
		un.sendKeys("yashodash19@gmail.com");
		WebElement continue1=driver.findElement(By.id("continue"));
		continue1.click();
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Shiva@123");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		Actions a1=new Actions(driver);
		WebElement actions=driver.findElement(By.id("nav-link-accountList"));
		a1.moveToElement(actions).perform();
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		WebElement username=driver.findElement(By.name("email"));
		Assert.assertEquals(username.isDisplayed(), true);
	}

}
