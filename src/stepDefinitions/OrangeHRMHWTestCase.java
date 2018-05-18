package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMHWTestCase {
	
	WebDriver driver;
	
	@Given("^I am using firefox browser$")
	public void i_am_using_firefox_browser() {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Pedro\\Documents\\Selenium\\Drivers\\geckodriver.exe\\");
		driver= new FirefoxDriver();
		
	}

	@When("^I go to the OrangeHRM website$")
	public void i_go_to_the_OrangeHRM_website() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^Enter valid username and password$")
	public void enter_valid_username_and_password(DataTable data) {
	    
		List<List<String>>dataT= data.raw();
	    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(dataT.get(0).get(0));
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(dataT.get(0).get(1));
	
	}
	@When("^I click login$")
	public void i_click_login() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() {
		driver.findElement(By.xpath("//b[contains(.,'PIM')]")).click();
	}

	@When("^click the Add button$")
	public void click_the_Add_button(){
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
	}

	@When("^Enter Employee First Name as \"([^\"]*)\"$")
	public void enter_Employee_First_Name_as(String Fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Fname);
	}

	@When("^Enter Employee Last Name as \"([^\"]*)\"$")
	public void enter_Employee_Last_Name_as(String Lname) {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Lname);
	}

	@When("^Enter Employee ID as \"([^\"]*)\"$")
	public void enter_Employee_ID_as(String EID) {
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys(EID);
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() {
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}

	@Then("^I should validate PIM Employee registration$")
	public void i_should_validate_PIM_Employee_registration() {
		System.out.println("Employee PIM registration is displayed");
	}

	

}
