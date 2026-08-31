package testCases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import testBase.BaseClass;

@Test
public class TC_001LoginPageTest extends BaseClass {
	
	LoginPage lp;
	ProductListPage plp;
	
	
	public void login() throws InterruptedException {
		lp= new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.ClickLoginbtn();
		
		plp = new ProductListPage(driver);
		 String textProduct = plp.VisibilityOfTextProduct();
		 Assert.assertEquals(textProduct, "Products");
	}
	
	
	

}
