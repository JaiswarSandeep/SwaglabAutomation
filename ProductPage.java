package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver pd;
	
	public ProductPage(WebDriver ud) {
		
		pd=ud;
		PageFactory.initElements(ud, this);
		
	}
	
	@FindBy(id="item_1_title_link")
	WebElement Product1;
	
//	@FindBy(css="button.btn_primary.btn_inventory")
//	WebElement AddtoCart;
//	
//	@FindBy(css="path[fill='currentColor']")
//	WebElement Cart;
//	
	public void selectproduct()
	{
		Product1.click();
	}
//     public void Add_toCart() {
//		
//		AddtoCart.click();
//	}
//	
//	
//	
//	public void cart() {
//		Cart.click();
//		
//	}

	
	
}
