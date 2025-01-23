package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver driver;
	//step 1
	@FindBy(name="email")  
	WebElement username;
	
	@FindBy(id="continue")  
	WebElement cntbutton;
	
	@FindBy(id="ap_password")  
	WebElement password;
	
	@FindBy(id="signInSubmit")  
	WebElement signin_button;
	
	//step 2
	public void un()
	{
	username.sendKeys("yashodash19@gmail.com");
	}
	public void continue_button() throws InterruptedException
	{
	cntbutton.click();
	Thread.sleep(3000);
	}
	public void pwd()
	{
																												password.sendKeys("Shiva@123");
	}
	public void sigin()
	{
	signin_button.click();
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
}
