package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

@Test
public class TC_013RemoveProductFromCartPage extends BaseClass {
	LoginPage lp ;
	ProductListPage plp;
	CartPage cp;
	CheckoutPage chkoutp;
	public void removeProductFromCartTest() throws InterruptedException {
		lp= new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
			lp.ClickLoginbtn();
		 plp = new ProductListPage(driver);
		 plp.checkAllprodctAvailableInListPage();
		 plp.AddAllProductInToCart();
		plp.gotocartPage(); 
		  cp = new CartPage(driver);
		  cp.removeProductFromCart();
		  
		 
	}

	
	
	
	
	
	
	
	
	

}
