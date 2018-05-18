package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMClassExerciseTestCase {
	
	WebDriver driver;
	
	@Given("^I am using firefox$")
	public void i_am_using_firefox() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver= new FirefoxDriver();
	}

	@When("^I go to the OrangeHRM page$")
	public void i_go_to_the_OrangeHRM_page() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password(DataTable data) {
		List<List<String>>dataT= data.raw();
	    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(dataT.get(0).get(0));
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(dataT.get(0).get(1));
	}

	@When("^I click login button$")
	public void i_click_login_button() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("^validate login$")
	public void validate_login() {
		System.out.println("Login Displayed");
	}

	@Then("^click Recruitment tab$")
	public void click_Recruitment_tab() {
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
		}

	@Then("^click Add button$")
	public void click_Add_button() {
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	}

	@Then("^Enter Full Name$")
	public void enter_Full_Name(DataTable FullName) {
		List<List<String>>dataFN= FullName.raw();
		driver.findElement(By.xpath("//input[@id='addCandidate_firstName']")).sendKeys(dataFN.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='addCandidate_middleName']")).sendKeys(dataFN.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='addCandidate_lastName']")).sendKeys(dataFN.get(0).get(2));
	}

	@Then("^Enter Email$")
	public void enter_Email(DataTable email){
		List<List<String>>dataE= email.raw();
		driver.findElement(By.xpath("//input[@id='addCandidate_email']")).sendKeys(dataE.get(0).get(0));
		
		
	}
	
	
@When("^I click Save button$")
	public void i_click_Save_button() {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@Then("^validate Employee added$")
	public void validate_Employee_added() {
		System.out.println("Display Employee Info");
	}
	
	//Regex means Regular Expression
	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String pass) {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
	    
	}
	@When("^I enter valid <\"([^\"]*)\"> and valid <\"([^\"]*)\">$")
	public void i_enter_editor_and_editor(String username, String password) {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	}
	@When("^I quit the browser$")
	public void i_quit_the_browser() {
		driver.quit();
	    


	
}
	
	//Hook
	@Before
	public void runBrowser() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver= new FirefoxDriver();
		
	}
	 //After Hook
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
	