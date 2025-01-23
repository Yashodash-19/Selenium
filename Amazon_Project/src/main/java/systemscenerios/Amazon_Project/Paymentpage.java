package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-radio'])[5]")
	WebElement cod_radiobutton;
	@FindBy(xpath="(//input[@class='a-button-input a-button-text'])[3]")
	WebElement usethispayment_button;
	@FindBy(xpath="(//input[@id='placeOrder'])[1]")
	WebElement placeyouroder_button;
	
	public void cod()
	{
		cod_radiobutton.click();
	}
	public void usethispayment() throws InterruptedException
	{
		usethispayment_button.click();
		Thread.sleep(3000);
	}
	public void placeyouroder() throws InterruptedException
	{
		Thread.sleep(10000);
		placeyouroder_button.click();
	}
	
	public Paymentpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
