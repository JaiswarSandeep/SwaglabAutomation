package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver ld;
	
	public loginpage(WebDriver rd)
	{
		ld=rd;
		PageFactory.initElements(rd, this);
		
	}

	@FindBy(name="user-name")
	WebElement username;
	@FindBy(name="password")
	WebElement pass_word;
	@FindBy(id="login-button")
	WebElement login;
	
	
	
	public void user() {
		
		
		username.sendKeys("standard_user");
		
	}
	
	public void pass()
	{
		
		pass_word.sendKeys("secret_sauce");
	}
	public void log()
	{
		login.click();
	}
	
	
	
	
	
}
