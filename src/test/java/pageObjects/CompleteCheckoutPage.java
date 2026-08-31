package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteCheckoutPage {
WebDriver driver;
	@FindBy(xpath="//span[text()='Checkout: Complete!']") WebElement txtCheckoutComplete;	
	
	public CompleteCheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 public boolean isDisplaytxtCheckoutConmplete() {
		return  txtCheckoutComplete.isDisplayed();
		 
		}
}
