package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shalini\\BDDFrameworktest\\src\\test\\java\\feature",glue= {"stepdefinition"},
plugin= {"pretty","json:target/Htmlreport.json"},monochrome=true,dryRun=true,tags="@smoke or @regression" )
public class Testrun {

}
