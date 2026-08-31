package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
WebDriver driver;
	@FindBy(xpath="//span[text()='Your Cart']") WebElement lnkCart;
	@FindBy(xpath="//button[text()='Remove']") List<WebElement> cartProducts;
	@FindBy(xpath="//button[text()='Checkout']") WebElement btnCheckout;
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean displayYourCartButton() {
		return lnkCart.isDisplayed();
	}
	
public void removeProductFromCart() {

	while (true) {
		if(cartProducts.size() ==3) {
			break;
		}
		cartProducts.get(0).click();
	}
	}
		

		public void GoToCheckoutPage() {
			btnCheckout.click();
		}
	
	
	
	
	
	
	
}
