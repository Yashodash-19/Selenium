package testngprograms;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Annutation1
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
  @BeforeTest
public void beforetest()
{
	System.out.println("BeforeTest");
}
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("BeforeClass");
  }
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
  @AfterSuite
	public void aftersuite()
	{
		System.out.println("AfterSuite");
	}
@AfterTest
public void aftertest()
{
	System.out.println("AfterTest");
}
@AfterClass
public void AfterClass()
{
	  System.out.println("AfterClass");
}
@AfterMethod
public void aftermethod()
{
	  System.out.println("AfterMethod");
}
}
