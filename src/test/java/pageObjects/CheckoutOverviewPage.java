package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	WebDriver driver;
	double sum =0.0;
	
@FindBy(xpath="//span[text()='Checkout: Overview']") WebElement txtCheckoutOverview;
@FindBy(xpath="//button[text()='Remove']") List<WebElement> butsRemoveOnOverviewPage;
@FindBy(xpath="//div[@class='inventory_item_price']") List<WebElement> pricesOfProducts;
@FindBy(xpath="//div[@class='summary_subtotal_label']") WebElement itemTotal;
@FindBy(xpath="//div[@class='summary_tax_label']") WebElement taxAmount;
@FindBy(xpath="//div[@class='summary_total_label']") WebElement FinalAmount;
@FindBy(xpath="//button[text()='Finish']") WebElement btnFinish;

public CheckoutOverviewPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public boolean displayTxtCheckoutOverview() {
	return txtCheckoutOverview.isDisplayed();
}

public double orderTotal() {
	
	for (WebElement priceEle : pricesOfProducts) {
		String txtprice = priceEle.getText().replace("$", "").trim();
		double price = Double.parseDouble(txtprice);
		sum = sum + price;	
	}
	return sum;
}


public double checkOrderTotal() {
	  String totalOfItem = itemTotal.getText().replace("Item total: $", "").trim();
	double expTotal =  Double.parseDouble(totalOfItem);
	return expTotal;
}



public double finalAmount() {
	String FinalAmountText = FinalAmount.getText().replace("Total: $", "");
	double finalAmount = Double.parseDouble(FinalAmountText);
	return finalAmount;
}

public void redirectToCompleteCheckoutPage() {
	btnFinish.click();
	
}

}
