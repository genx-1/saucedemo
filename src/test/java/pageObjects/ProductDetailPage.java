package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
	WebDriver driver;
	@FindBy(xpath="//button[@id='back-to-products']") WebElement txtBackToProduct;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean displaytxtBackToProduct() {
		return txtBackToProduct.isDisplayed();
	}
	
	public void ClicklnkBackToProduct() {
		txtBackToProduct.click();
	}
	
	
	

}
