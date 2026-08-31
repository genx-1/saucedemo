package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
@FindBy(xpath="//span[text()='Checkout: Your Information']") WebElement btnCheckoutInfo; 
@FindBy(xpath="//input[@id='first-name']") WebElement txtFirstname;
@FindBy(xpath="//input[@id='last-name']") WebElement txtLastname;
@FindBy(xpath="//input[@id='postal-code']") WebElement txtZipCode;
@FindBy(xpath="//input[@id='continue']") WebElement btnContinuous;


public CheckoutPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}



  public boolean displayTxtCheckoutInfo() {
	return btnCheckoutInfo.isDisplayed();
}

public void goToCheckoutOverviewPage() {
	txtFirstname.sendKeys("test");
	txtLastname.sendKeys("test");
	txtZipCode.sendKeys("6900");
	btnContinuous.click();
	
}










}
