package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/User.feature",
                 glue= "Stepdefinitions",
                 monochrome = true,
                 dryRun = false,
                 //plugin = {"pretty","html:Test-output"}
            	  plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucmber.xml"}
)
public class Runner {

}

