package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutOverviewPage;
import pageObjects.CheckoutPage;
import pageObjects.CompleteCheckoutPage;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_020CheckoutCompleteTest 
	extends BaseClass{
		LoginPage lp;
		ProductListPage plp;
		CartPage cp;
		CheckoutPage chkoutp;
		CheckoutOverviewPage chkoutovrp;
		CompleteCheckoutPage compchkp;
		
		
		@Test
		public void completeCheckout() throws InterruptedException {
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
			 double totalAmount = chkoutovrp.orderTotal();
			 System.out.println(totalAmount);
			 double ordetTotal = chkoutovrp.checkOrderTotal();
			 System.out.println(ordetTotal);
			 Assert.assertEquals(totalAmount, ordetTotal);
			
			 double FinalPriceTotal = chkoutovrp.finalAmount();
			 System.out.println(FinalPriceTotal);
			 Assert.assertEquals(FinalPriceTotal, 79.89);
			 
			 chkoutovrp.redirectToCompleteCheckoutPage();
				
			 compchkp = new CompleteCheckoutPage (driver);
			 Assert.assertTrue(compchkp.isDisplaytxtCheckoutConmplete());
			 
			 
			 
		}
	}


