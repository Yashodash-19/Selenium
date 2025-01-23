package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhishlistPage 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")
	WebElement delete_button;
	
	public void delete() throws InterruptedException
	{
		Thread.sleep(3000);
		delete_button.click();
		Thread.sleep(3000);
	}
	
	public WhishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
