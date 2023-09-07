package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parametertest {
WebDriver driver;

@Given("Home page Should be loaded with the url {string}")
public void home_page_should_be_loaded_with_the_url(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Shalini\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(string);
  //  throw new io.cucumber.java.PendingException();
}

@When("User Enter valid (.*) and (.*)$")
public void user_enter_valid_first_and_first(String username,String password) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(password);
		
	    //throw new io.cucumber.java.PendingException();
}

@When("click on signinButton")
public void click_on_signin_button() {
	// Write code here that turns the phrase above into concrete actions
	
			driver.findElement(By.id("log-in")).click();
}

@Then("User must be able to login to their account")
public void user_must_be_able_to_login_to_their_account() {
	// Write code here that turns the phrase above into concrete actions
			String currenturl=driver.getCurrentUrl();
			Assert.assertEquals("https://demo.applitools.com/app.html", currenturl);
		   // throw new io.cucumber.java.PendingException();
}

@Then("close the driver")
public void close_the_driver() {
	driver.close();
}


}
