package systemscenerios.Amazon_Project;
//Login to amazon->search a product->add it to wishlist->remove it from wishlist->logout

import org.testng.annotations.Test;

public class TestCase4_AddingtoWishlist_removing extends LoginQuit
{
	@Test
	public void wishlist_logout() throws InterruptedException
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
		productpage.viewyourlist();
		WhishlistPage whishlist=new WhishlistPage(driver);
		whishlist.delete();
	    homepage.accountandlist(driver);
	    homepage.logout();

}
}
