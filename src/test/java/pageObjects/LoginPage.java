package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPage   {
	WebDriver driver;
	
	
	
@FindBy(xpath="//*[@id='user-name']") WebElement txtUsername;
@FindBy(xpath="//*[@id='password']") WebElement txtPassword;
@FindBy(xpath="//*[@id='login-button']") WebElement btnLogin;

public LoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void enterUsername(String uname) {
	txtUsername.sendKeys(uname);
}

public void enterPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void ClickLoginbtn() {
	btnLogin.click();
}

public String  verifyTitle() {
	return driver.getTitle();
}

public boolean verifyTitleContainSwag() {
	String title = driver.getTitle();
	boolean titleContain = title.toLowerCase().contains("Swag".toLowerCase());
	return titleContain;
}






}
