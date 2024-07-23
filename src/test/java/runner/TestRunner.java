package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Logins.feature",
		glue={"stepdefinitions"},
		tags="@positivelogins",
		dryRun=false,
		plugin= {"pretty","html:target/CucumberReport.html"}
		)
public class TestRunner {

}
