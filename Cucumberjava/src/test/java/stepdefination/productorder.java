package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class productorder {
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("go to swaglabs page")
	public void go_to_swaglabs_page() {
		System.out.println("Inside step browser is open");
		String projectPath = System.getProperty("userdir");
		System.out.println("Project path is:" +projectPath);
		
	    System.getProperty("WebDriver.chrome.driver", "C:/Users/HP/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

@And("User enters the username and password and click on login button")
	public void user_enters_the_username_and_password_and_click_on_login_button() throws InterruptedException {
	    driver.navigate().to("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
}

	@SuppressWarnings("deprecation")
	@And("User is on home page")
	public void user_is_on_home_page() {
		
	   driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Then("Tap on cart option")
	public void tap_on_cart_option() {
	  driver.findElement(By.xpath(" //*[@id=\"shopping_cart_container\"]/a")).click();
	  }

	@And("Tap on Checkout button")
	public void tap_on_checkout_button() {
	   driver.findElement(By.id("checkout")).click();
	}

	@Then("user enters First Name and last name and zip code")
	public void user_enters_first_name_and_last_name_and_zip_code() {
	    driver.findElement(By.id("first-name")).sendKeys("Hatum");
	    driver.findElement(By.id("last-name")).sendKeys("Hussain");
        driver.findElement(By.id("postal-code")).sendKeys("7500");
    }

	@SuppressWarnings("deprecation")
	@And("clicks on Continue button")
	public void clicks_on_continue_button() {
	driver.findElement(By.id("continue")).click();  
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	}

	@When("Product description page appears")
	public void product_description_page_appears() {
   
	}

	@And("click on Finish button")
	public void click_on_finish_button() {
     driver.findElement(By.id("finish")).click();
			
	
	}

	@Then("user is successfully ordered complete the order")
	public void user_is_successfully_ordered_complete_the_order() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		driver.close();

	}


}
