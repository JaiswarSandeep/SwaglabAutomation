package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.ProductPage;

public class TestCaseSelectProduct extends Base {
	WebDriver d;
	@Test
	public void productselection()
	{
		TestCase1 tc1=new TestCase1();
		tc1.logintest();
		
		ProductPage pp=new ProductPage(d);
		pp.selectproduct();
//		pp.Add_toCart();
//		pp.cart();
//		
		
	}

	
	
	
	
}
