package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

@Test
public class TC_002VerifiTitle extends BaseClass {
	LoginPage lp ;
	
	public void verifyTitleTest() {
		lp = new LoginPage(driver);
		String title = lp.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
	}

}
