package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_005PrintProductClickLastProduct extends BaseClass {
	LoginPage lp;
	ProductDetailPage pdp;
	ProductListPage plp;
	@Test
	public void ClickLastProduct() {
		
	
 lp= new LoginPage(driver);
 lp.enterUsername(prop.getProperty("username"));
	lp.enterPassword(prop.getProperty("password"));
	lp.ClickLoginbtn();
 plp = new ProductListPage(driver);
plp.sortProducts();
 
 plp.clickLastProduct("Sauce Labs Fleece Jacket");
 
 pdp = new ProductDetailPage(driver);
 boolean lnkBackToProduct = pdp.displaytxtBackToProduct();
 Assert.assertTrue(lnkBackToProduct);
	}
	
	
	
}
