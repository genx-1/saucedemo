package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;
import utilities.DataProviders;
import utilities.DataProviders1;


public class TC_014DataProviderWithoutExcel extends BaseClass{
	LoginPage lp ;
	ProductListPage plp;
  @Test (dataProvider="loginWithoutExcel", dataProviderClass=DataProviders1.class)
	public void getDataWuthoutExcel(String username, String password, String exp) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.ClickLoginbtn();
		plp = new ProductListPage (driver);
		boolean status = plp.isDisplayProductText();
		
		if(exp.equalsIgnoreCase("valid")) {
			Assert.assertTrue(status, "valid user not logged in");
				driver.navigate().back();
			}
			
			
			if (exp.equalsIgnoreCase("invalid")) {
				Assert.assertFalse(status, "invalid user loggedin");
				driver.navigate().refresh();
			}
			
			
		
	}

}
