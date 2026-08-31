package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_011LoginDDT extends BaseClass{
	LoginPage lp;
	ProductListPage plp;
	@Test(dataProvider = "loginData", dataProviderClass=DataProviders.class)
	public void loginWithDDT(String username, String password, String response) throws InterruptedException {
		try{
			lp = new LoginPage(driver);
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.ClickLoginbtn();
		//plp = new ProductListPage(driver);
	//	boolean status = plp.isDisplayProductText();
		
		if(response.equalsIgnoreCase("valid")) {
			
			plp = new ProductListPage(driver);
			boolean status = plp.isDisplayProductText();
				Assert.assertTrue(status);
				driver.navigate().back();
				
		}
		
			
		
		else if(response.equalsIgnoreCase("invalid")) {
			Thread.sleep(3000);
			driver.navigate().refresh();
				Assert.assertTrue(false);
				
			}
				
			
			
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
