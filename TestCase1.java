package TestCases;

import org.testng.annotations.Test;

import PageObjects.ProductPage;
import PageObjects.loginpage;

public class TestCase1 extends Base {
	
	@Test
	public void logintest() {
		
		
		setup();
		d.get("https://www.saucedemo.com/v1/");

		loginpage lp=new loginpage(d);
		lp.user();
		lp.pass();
		lp.log();
		
	
		
	}

}
