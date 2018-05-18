package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberHWHooks {
	
	WebDriver driver;
	
	@Given("^I am using Firefox browser$")
	public void i_am_using_Firefox_browser() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@When("^I got to the site$")
	public void i_got_to_the_site() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^Enter valid username \"([^\"]*)\" and password\"([^\"]*)\"$")
	public void enter_valid_username_and_password(String user, String pass) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		
	}

	@When("^Click the login button$")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	@Then("^Validate login$")
	public void validate_login() {
		System.out.println("Display Login");
	}
	
	@Before()
	public void runBrowser() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Before("@First")
	public void gotoURL() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@After("@First")
	public void quitBrowser() {
		driver.quit();
	}
	
	@After()
	public void closeBrowser() {
		driver.quit();
		
	}



}
