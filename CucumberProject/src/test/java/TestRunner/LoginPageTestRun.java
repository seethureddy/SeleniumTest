package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features="C:/Users/ESHWAR/eclipse-workspace/CucumberProject/src/test/java/Features",
	glue= {"StepDefinition"},
	plugin= {"pretty","html:target/logintest-report"}
)
public class LoginPageTestRun {

	
}
