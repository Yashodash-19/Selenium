package systemscenerios.Amazon_Project;

import org.testng.annotations.Test;

//Login to amazon->search a product->add it to cart->incrdement its count by 3->remove the product which are presnet in cart->logout						
public class TestCase5_Login_Search_product_cart_add_remove extends LoginQuit
{
	@Test
	public void addtocart_logout() throws InterruptedException
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
		//productpage.viewyourlist();
		productpage.continueshopping();
		productpage.addtocart();
		productpage.gotocart(driver);
		
        Addcartpage addtocart=new Addcartpage(driver);
		addtocart.incrementprod();
        addtocart.delete();
	    homepage.accountandlist(driver);
	    homepage.logout();
	}

}
