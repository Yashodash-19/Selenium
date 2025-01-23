package systemscenerios.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultpage 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")	
	WebElement searchresult_product;
	
	
	public void search() throws InterruptedException
	{
		Thread.sleep(3000);
		searchresult_product.click();
	}
	
	
 public Searchresultpage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
}
