package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	 WebDriver driver;
	
	@Given("I will launch the browser")
	public void i_will_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	}

	@Given("I will enter the url")
	public void i_will_enter_the_url() {
	    driver.get("https://www.flipkart.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Login page is displayed i will enter username and password")
	public void login_page_is_displayed_i_will_enter_username_and_password() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7676714748");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Sharanu48");
		
	}

	@When("I will click on login")
	public void i_will_click_on_login() throws InterruptedException 
	{
		Thread.sleep(4000);
      driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Then("I will validate whether home page is displayed or not")
	public void i_will_validate_whether_home_page_is_displayed_or_not() 
	{
		System.out.println("displayed");
	}
}
