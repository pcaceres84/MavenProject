package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMTestCase {
	WebDriver driver;
	
	
	
	@Given("^I have a firefox browser running$")
	public void i_have_a_firefox_browser_running() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver = new FirefoxDriver();
	    
	}

	@When("^I go to the site$")
	public void i_go_to_the_site() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}

	@When("^enter valid username$")
	public void enter_valid_username() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	}

	@When("^enter valid password$")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("^I should validate login$")
	public void i_should_validate_login() {
		System.out.println("Login is present");
		
	    
	}
	
	@When("^enter valid username as \"([^\"]*)\"$")
	public void enter_valid_username_as(String uname)  {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(uname);
	    
	}

	@When("^enter valid password as \"([^\"]*)\"$")
	public void enter_valid_password_as(String pass) {
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
	}

	
	@When("^I click on Recruitment link$")
	public void i_click_on_Recruitment_link()  {
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
	    
	}

	@When("^I click Add button$")
	public void i_click_Add_button()  {
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	}

	@When("^I type in First Name$")
	public void i_type_in_First_Name() {
		driver.findElement(By.xpath("//input[@id='addCandidate_firstName']")).sendKeys("John");
	}

	@When("^I type in Last Name$")
	public void i_type_in_Last_Name() {
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys("Smith");
	    
	}

	@When("^I type in email$")
	public void i_type_in_email() {
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys("mail@gmail.com");
	    
	}

	@When("^I click the save button$")
	public void i_click_the_save_button() {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@Then("^I should validate registered name$")
	public void i_should_validate_registered_name() {
		System.out.println("Name is displayed");
	}





}
