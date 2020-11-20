package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/main/java/Features"},
        plugin = {"json:target/cucumberReports/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {"tests"})
public class testNGRunner extends AbstractTestNGCucumberTests {
}