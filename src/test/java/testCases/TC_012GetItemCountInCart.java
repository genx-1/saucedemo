package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

@Test
public class TC_012GetItemCountInCart extends BaseClass {
	LoginPage lp;
	ProductListPage plp;
	public void getCountOfCartItemTest() {
		lp = new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.ClickLoginbtn();
		plp = new ProductListPage(driver);
		plp.addMultipleProductToCart("Sauce Labs Backpack");
		plp.addMultipleProductToCart("Sauce Labs Bike Light");
		int count = plp.getCountOfCartItem();
		Assert.assertEquals(count, 2);
	}
	
	
	
}
