package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class ProductListPage  {
	
	WebDriver driver;


@FindBy(xpath = "//span[@class='title']") WebElement productTitle;
@FindBy(xpath="//*[text()='Products']") WebElement txtProduct;
@FindBy(xpath="//select[@class='product_sort_container']") WebElement sortContainer;
@FindBy(xpath="//div[@class='inventory_item_price']") List<WebElement> ProductsPrice;
@FindBy(xpath="//div[@class='inventory_item_name ']") List<WebElement> ProductsNames;
@FindBy(xpath="(//div[@class='inventory_item_name '])[6]") WebElement LastProductsNames;
@FindBy(xpath="//button[text()='Add to cart']") List<WebElement> buttonsAddToCart;
@FindBy(xpath="//span[text()='6']/parent::a") WebElement iconCart;
@FindBy(xpath="//div[@id='shopping_cart_container']") WebElement generalCartIcon;
@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]//span") WebElement countCartItem;
@FindBy(xpath="//button[text()='Remove']") List<WebElement> buttonsProRemove;

public ProductListPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

 public String VisibilityOfTextProduct() throws InterruptedException {
	 Thread.sleep(5000);
	String textProduct =txtProduct.getText();
	return textProduct;
}
 
 public boolean isDisplayProductText() {
	return txtProduct.isDisplayed();
 }
 
 public void sortProducts() {
	 Select s = new Select(sortContainer);
	 s.selectByVisibleText("Price (low to high)");
 }
 
 public boolean verifyPageSorted() {
List<Double> actualPrices = new ArrayList<>();
for(WebElement price: ProductsPrice ) {
	actualPrices.add(Double.parseDouble(price.getText().replace("$", "")));
}
	 List<Double> sortePrices = new ArrayList<>(actualPrices);
	 Collections.sort(sortePrices);
	 
return actualPrices.equals(sortePrices);
 }
 
 
 public void clickLastProduct(String Productname) {
	 for(WebElement name:ProductsNames) {
		 
		if( name.getText().equalsIgnoreCase(Productname)) {
			name.click();
			 break;
		}
	      }                
              }	 
                                     
	
 

 public void addMultipleProductToCart(String product) {	
	 
String addToCartXpath = "//div[text()='"+product+"']/ancestor::div[@class='inventory_item']//button";	 
driver.findElement(By.xpath(addToCartXpath)).click();
	 }
 
 public void printAllProduct() {
	 for(WebElement nameOfProduct:ProductsNames) {
		 System.out.println(nameOfProduct.getText());
	 }
 }
 
 
 public void CheckAllPresentOnListPage() {
	 for(WebElement cartButton:buttonsAddToCart) {
		 if(cartButton.getText().equalsIgnoreCase("Add to cart")) {
			 
		 }
		 else {
			 for(WebElement removeButton:buttonsProRemove) {
				 if(removeButton.getText().equals("Remove")){
					 removeButton.click();
				 }
			 } 
		 }
	 }}
 
 
 public void AddAllProductInToCart() {
	 while(true) {
		 if(buttonsAddToCart.size()==0) {
			 break;
		 }
		 buttonsAddToCart.get(0).click(); 
	}
 }
	 
 
 public void gotocartPage() throws InterruptedException {
	 Thread.sleep(2000);
	 generalCartIcon.click();	 
 }
 
 public int getCountOfCartItem() {
	 int item = Integer.parseInt(countCartItem.getText().trim());
	 return item;
 }
 
 
 public void checkAllprodctAvailableInListPage() {
	 for (WebElement productAvailable : buttonsAddToCart) {
		 productAvailable.getText().equals(productAvailable);
	 }
		
 }

 
 
 
 
 }

 

 
 
 
 
 
 
 
 






