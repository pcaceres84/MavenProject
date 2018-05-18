package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase {
	WebDriver driver;
	
	@Given("^I have a Firefox browser running$")
	public void i_have_a_Firefox_browser_running() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		
		
	    }

	@When("^I go to the website$")
	public void i_go_to_the_website()  {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password()  {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	    
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button()  {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    
	}

	@Then("^I should see a logout link$")
	public void i_should_see_a_logout_link()  {
		System.out.println("The logout link is present");
		
	    
	}
	
	@Given("^I have a Chrome browser running$")
	public void i_have_a_Chrome_browser_running() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\chromedriver.exe\\");
		driver= new ChromeDriver();
		
		
		
	}
	    
	    



}
