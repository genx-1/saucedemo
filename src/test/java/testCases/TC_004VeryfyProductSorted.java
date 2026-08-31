package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_004VeryfyProductSorted extends BaseClass{
	LoginPage lp;
	ProductListPage plp ;
	
	
	@Test
	public void verifyProductSorted() {
		lp = new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.ClickLoginbtn();
		
		plp = new ProductListPage(driver);
		
		plp.sortProducts();
		Assert.assertTrue(plp.verifyPageSorted());
		
		
	}
}
