package systemscenerios.Amazon_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")  
	WebElement accountandlist_hoverover;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")  
	WebElement signin_home;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_button;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement logout_button;
	
	@FindBy(name="email")  
	WebElement username;
	
	//step 2
	public void accountandlist(WebDriver driver)
	{
	Actions a1=new Actions(driver);
	a1.moveToElement(accountandlist_hoverover).perform();		
	}
	public void signin()
	{
		signin_home.click();		
	}
	public void search()
	{
		search_button.sendKeys("book"+Keys.ENTER);
	}
	
	public void logout()
	{
		logout_button.click();
		Assert.assertEquals(username.isDisplayed(), true);
	}
	
	
	//step 3
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	

}
