package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
	WebElement placeyourorder_button;
	
	
	public  void placeorder()
	{
		placeyourorder_button.click();
	}
   public  Checkoutpage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}

