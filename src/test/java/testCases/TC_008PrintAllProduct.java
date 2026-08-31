package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

public class TC_008PrintAllProduct extends BaseClass{
	LoginPage lp;
	ProductListPage plp;
	@Test
	public void printAllProductTest() {
		lp= new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
			lp.ClickLoginbtn();
		 plp = new ProductListPage(driver);
		 plp.printAllProduct();
	}
}
