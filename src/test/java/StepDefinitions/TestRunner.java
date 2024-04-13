package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"},
plugin = {"pretty", "html:target/htmlreport.html","json:report.json","junit:report.xml"})
public class TestRunner {

}
