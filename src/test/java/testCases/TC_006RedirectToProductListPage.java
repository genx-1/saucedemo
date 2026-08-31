package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

@Test
public class TC_006RedirectToProductListPage extends BaseClass{
LoginPage lp;
ProductListPage plp;
ProductDetailPage pdp;
	public void lnkClickBackToProductTest() {
		lp = new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.ClickLoginbtn();
		
		plp = new ProductListPage(driver);
		plp.sortProducts();
		plp.clickLastProduct("Sauce Labs Fleece Jacket");
		driver.navigate().back();
		plp.clickLastProduct("Sauce Labs Onesie");
		
		pdp = new ProductDetailPage(driver);
		pdp.ClicklnkBackToProduct();
		
	}
	
	
	
	
	
}
