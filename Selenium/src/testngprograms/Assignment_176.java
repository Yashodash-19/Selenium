package testngprograms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_176 
{
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
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
