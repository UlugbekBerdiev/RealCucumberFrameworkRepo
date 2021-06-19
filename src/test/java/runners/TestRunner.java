package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
		glue="step_definitions",
		dryRun=false
		)

public class TestRunner {
	//dryRun= true or false--> run only the steps, not the implementations
}
