package testngprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class broken_links extends Launchquit 
{
   @Test
   public void alllinks() throws IOException
   {
	 List<WebElement> broken_links=  driver.findElements(By.tagName("a"));
	   int count=broken_links.size();
	   System.out.println(count);
	   for(int i=0;i<count;i++)
	   {
		   WebElement e1=broken_links.get(i);
		   String link=e1.getAttribute("href");
		   String text=e1.getText();
		   System.out.println(link);
			System.out.println(text);
			verifylink(link);
	   }
   }
			static void verifylink(String link) throws IOException
			{
				try
				{
				URL u1=new URL(link);
				HttpURLConnection hc=	(HttpURLConnection) u1.openConnection();
				if(hc.getResponseCode()==200 || hc.getResponseCode()==201)
				{
					System.out.println("links are valid");
					System.out.println(hc.getResponseMessage());
					System.out.println(hc.getResponseCode());
					
				}
				else
				{
					System.out.println("links are not valid");
					System.out.println(hc.getResponseMessage());
					System.out.println(hc.getResponseCode());
				}
				}
				catch(MalformedURLException e1) 
				{
					System.out.println("handeled the exception");
				}
				catch(ClassCastException c1)
				{
					System.out.println("handeled the exception");
				}
			}
	   
			
   }

