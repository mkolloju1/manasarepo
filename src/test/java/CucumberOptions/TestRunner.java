package CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C://ApiTestCucumber//src//test//java//features//feature1.feature",
		glue="StepDefination")
//glue a parameter is used to represent SS
//testrunner and step definition should have same parent and provide glue and provide package name to give knowledge
//there should be one mapping implementation for each gherkin line
//pretty/tidy gherkin to generate Step definitions
public class TestRunner {
}