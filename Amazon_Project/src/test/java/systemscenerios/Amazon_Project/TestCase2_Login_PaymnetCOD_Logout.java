package systemscenerios.Amazon_Project;
//Login to amazon->search a product->add it to wishlist->add it to cart->Make a paymnet using COD->logout			

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_Login_PaymnetCOD_Logout extends LoginQuit
{
	
	@Test
	public void login_cart_logout1() throws InterruptedException
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
		productpage.proccedtobuy();
		Addresspage address =new Addresspage(driver);
		address.change1();
		address.address();
		address.delivertothisaddress();
		Checkoutpage checkout=new Checkoutpage(driver);
		//checkout.placeorder();
		homepage.accountandlist(driver);
		homepage.logout();
		
		
		
		
		
}

}
