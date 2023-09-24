package ProductBuyingFollow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginandplaceorderTest {

  @Test
  public void OrderPlaceTest() throws InterruptedException {
    
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		d.get("https://www.saucedemo.com/v1/");

		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();

		d.findElement(By.id("item_1_title_link")).click();
		d.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();
		d.findElement(By.cssSelector("path[fill='currentColor']")).click();
		
		
		
		d.findElement(By.linkText("CHECKOUT")).click();
		d.findElement(By.id("first-name")).sendKeys("Sandeep Ramdhani");
		d.findElement(By.id("last-name")).sendKeys("Jaiswar");
		d.findElement(By.id("postal-code")).sendKeys("400072");
		
		d.findElement(By.cssSelector("input[type='submit']")).click();
		d.findElement(By.linkText("FINISH")).click();
		d.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		d.findElement(By.linkText("Logout")).click();
		d.close();
		
	  
  }
}
