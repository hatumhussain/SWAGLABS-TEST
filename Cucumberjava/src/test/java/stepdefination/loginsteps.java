package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginsteps {
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
	System.out.println("Inside step browser is open");
	String projectPath = System.getProperty("userdir");
	System.out.println("Project path is:" +projectPath);
	
    System.getProperty("WebDriver.chrome.driver", "C:/Users/HP/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	}

	@And("User redirectes to login page")
	public void user_redirectes_to_login_page() {
	   driver.navigate().to("https://www.saucedemo.com/");
	 
	}

	@When("user enters Username and Password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(2000);
		 
	
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.id("login-button")).click();
	    
	}

	@Then("user is successfully redirected to home page")
	public void user_is_successfully_redirected_to_home_page() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		driver.close();
	   
	}
	
}
