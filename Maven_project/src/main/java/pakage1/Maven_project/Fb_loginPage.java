package pakage1.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginPage 
{
	WebDriver driver;
	@FindBy(id="email")
	WebElement un;
	
	@FindBy(name="pass")
	WebElement pwd;

	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	public void username()
	{
		un.sendKeys("yashodash19@gmail.com");
	}
		
	public void password()
	{
		pwd.sendKeys("yashoda@19");
	}
	public void login()
	{
		login_button.click();
	}
	
	public Fb_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
