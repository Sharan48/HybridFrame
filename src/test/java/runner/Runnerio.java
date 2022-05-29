package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(
			features = {".\\src\\test\\java\\Features"},
			glue = {"stepDefinition"},
			dryRun = false, //true:map feature file and step definition for missing steps
			
			monochrome = true //to remove special character in  console
			
			
			)
	
	public class Runnerio extends AbstractTestNGCucumberTests
	{	

}
