package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutOverviewPage;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

@Test
public class TC_016DoCheckout extends BaseClass{
	LoginPage lp;
	ProductListPage plp;
	CartPage cp;
	CheckoutPage chkoutp;
	CheckoutOverviewPage chkoutovrp;
	public void DoCheckoutTest() throws InterruptedException {
	 lp	= new LoginPage(driver);
	 lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
	 lp.ClickLoginbtn();
	 
	 plp = new ProductListPage(driver);
	 plp.checkAllprodctAvailableInListPage();
	 plp.AddAllProductInToCart();
	 plp.gotocartPage();
	 
	 cp = new CartPage(driver);
	 cp.removeProductFromCart();
	 cp.GoToCheckoutPage();
	 
	 chkoutp = new CheckoutPage(driver);
	 chkoutp.goToCheckoutOverviewPage();
	 
	 chkoutovrp = new CheckoutOverviewPage(driver);
	 Assert.assertTrue(chkoutovrp.displayTxtCheckoutOverview());
		
		
	}
	
	

}
