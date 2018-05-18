package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},// path to the feature file
		glue= {"stepDefinitions"},// path to the step definition folder
		tags= {"@Firefox"},
		dryRun= false,
		strict= true,//if the steps are not defined it will fail
		monochrome= false// display the console output in a readable format
		
		
		)
public class TestRunner {

}
