package systemscenerios.Amazon_Project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product1Page

{
	WebDriver driver;
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@FindBy(id="add-to-wishlist-button-submit") 
	WebElement wishlist_button;
	
	@FindBy(xpath="//a[.='View Your List']")
	WebElement viewyourlist_button;
	
	@FindBy(id="continue-shopping")
	WebElement continueshopping_button;
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart_button;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proccedtobuy_button;
	
	@FindBy(xpath="//span[@id='sw-gtc']")
	WebElement gotocart_button;
	
	public void wishlist(WebDriver driver) throws InterruptedException
	{
		Set <String> pcid=	driver.getWindowHandles();
	Iterator<String> pciditr	=    pcid.iterator();
	String parentid=pciditr.next();
	
	String childid=pciditr.next();
	driver.switchTo().window(childid);
	wishlist_button.click();
	Thread.sleep(1000);
	
	}
	
	public void viewyourlist() throws InterruptedException
	{
		
		Thread.sleep(3000);
		viewyourlist_button.click();
	}
	public void continueshopping() throws InterruptedException
	{
		w1.until(ExpectedConditions.elementToBeClickable(continueshopping_button) );
		continueshopping_button.click();
		

	}
	
	public void addtocart() throws InterruptedException
	{
		Thread.sleep(4000);
		//w1.until(ExpectedConditions.elementToBeClickable(addtocart_button) );
		addtocart_button.click();
	}
	public void proccedtobuy ()
	{
		proccedtobuy_button.click();
	}
	
	public void gotocart(WebDriver driver) throws InterruptedException
	{
		w1.until(ExpectedConditions.elementToBeClickable(gotocart_button) );
		gotocart_button.click();
	}
	
	
	public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
