package testngprograms;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_177 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3");
	}

}
