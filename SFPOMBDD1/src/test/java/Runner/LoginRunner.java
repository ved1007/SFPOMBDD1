package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/vedant.jagani/Desktop/Salesforce/SFPageObjectModelBDD/SFPOMBDD1/src/test/java/Features/Login.feature",

		glue = { "stepDefinitions2" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = true, strict = true, dryRun = true)

public class LoginRunner {

}
