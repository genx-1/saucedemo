package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;
@Test
public class TC_010GoToCartPage extends BaseClass {
LoginPage lp;
ProductListPage plp;
CartPage cp;
	public void goToCartTest() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.ClickLoginbtn();
		plp = new ProductListPage(driver);
		plp.checkAllprodctAvailableInListPage();
		plp.AddAllProductInToCart();
		plp.gotocartPage();
		cp = new CartPage(driver);
		
		 Assert.assertTrue(cp.displayYourCartButton());
	}
}
