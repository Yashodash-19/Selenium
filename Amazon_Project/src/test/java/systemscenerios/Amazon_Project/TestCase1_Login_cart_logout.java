package systemscenerios.Amazon_Project;
import org.testng.annotations.Test;
//Login to amazon->search a product->add it to wishlist->add it to cart->logout			
public class TestCase1_Login_cart_logout extends LoginQuit
{
	@Test
	public void login_cart_logout() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		LoginPage loginpage=new LoginPage(driver);
		Thread.sleep(1000);
		loginpage.un();
		loginpage.continue_button();
		loginpage.pwd();
		loginpage.sigin();
		homepage.search();
		Searchresultpage searchresult=new Searchresultpage(driver);
		searchresult.search();
		Product1Page  productpage=new Product1Page(driver);
		productpage.wishlist(driver);
		productpage.continueshopping();
		productpage.addtocart();	
		homepage.accountandlist(driver);
		homepage.logout();
		
		
		
		
		
}
}
