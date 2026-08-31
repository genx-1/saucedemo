package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_009AddAllProductToCart extends BaseClass{
	LoginPage lp;
	ProductListPage plp;
	CartPage cp;
	@Test
	public void AddAllProductToCartTest() throws InterruptedException {
		lp= new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
			lp.ClickLoginbtn();
			
		 plp = new ProductListPage(driver);
		 plp.checkAllprodctAvailableInListPage();
		 Thread.sleep(3000);
		 plp.AddAllProductInToCart();
		 
		 
	}
}
