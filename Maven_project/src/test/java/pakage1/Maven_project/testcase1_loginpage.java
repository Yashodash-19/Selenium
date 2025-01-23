package pakage1.Maven_project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1_loginpage
{
	@Test
	public void loginwithcredentials()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Fb_loginPage f1=new Fb_loginPage(driver);
		f1.username();
		f1.password();
		f1.login();
		
	}

}
