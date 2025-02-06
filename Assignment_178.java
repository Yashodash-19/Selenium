package testngprograms;

import org.testng.annotations.Test;

public class Assignment_178 
{
	@Test(priority=1)
	public void registration()
	{
		System.out.println("this is Registration page");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("this is login page");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("this is logout page");
	}

}
