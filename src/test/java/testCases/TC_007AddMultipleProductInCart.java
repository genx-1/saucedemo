package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_007AddMultipleProductInCart extends BaseClass{
	LoginPage lp;
	ProductListPage plp;
	@Test
	public void addMultipleProductInCartTest() throws InterruptedException {
		lp= new LoginPage(driver);
		 lp.enterUsername("standard_user");
			lp.enterPassword("secret_sauce");
			lp.ClickLoginbtn();
		 plp = new ProductListPage(driver);
		 plp.checkAllprodctAvailableInListPage();
		 Thread.sleep(3000);
		plp.addMultipleProductToCart("Sauce Labs Onesie");
		plp.addMultipleProductToCart("Sauce Labs Fleece Jacket");
		 
		 
		 
		 
	}
	
	
	
	
}
