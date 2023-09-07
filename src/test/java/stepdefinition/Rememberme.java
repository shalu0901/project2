package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rememberme {
	
	WebDriver driver;
	@Given("Home Url should be loaded {string}")
	public void home_url_should_be_loaded(String string) {
 // Write code here that turns the phrase above into concrete actions

		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shalini\\geckodriver.exe");

		driver=new FirefoxDriver();

		driver.get(string);

	    //throw new io.cucumber.java.PendingException();
	}

	@When("User click on remember me check box")
	public void user_click_on_remember_me_check_box() {
	    driver.findElement(By.className("form-check-input")).click();
	}

	@Then("Remember me check box should be checked in")
	public void remember_me_check_box_should_be_checked_in() {
	    boolean output=driver.findElement(By.className("form-check-input")).isSelected();
	    System.out.println(output);
	}

}
