package selenium_assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class links_linktext_167 {

	public static void main(String[] args) throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>	alllinks=	driver.findElements(By.tagName("a"));
		int count=	alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1=			alllinks.get(i);
			String link=			e1.getAttribute("href");
				String text=					e1.getText();
		System.out.println(link);
	//	System.out.println(text);
		verifylink(link);
		}
}
		static void verifylink(String link) throws IOException
		{
			try {
			URL u1=new URL(link);
	
			HttpURLConnection c1=			(HttpURLConnection) u1.openConnection();
					if(		c1.getResponseCode()==200 || c1.getResponseCode()==201)
					{
						System.out.println("Link is valid");
						System.out.println(c1.getResponseMessage());
					}
					else
					{
						System.out.println("Link is not valid");
						System.out.println(c1.getResponseMessage());
					}
			}
			catch(MalformedURLException m1)
			{
				System.out.println("handeled the exception");
			}
			
			catch(NullPointerException m2)
			{
				System.out.println("handeled the exception");
			}
		}
	
	
	
}