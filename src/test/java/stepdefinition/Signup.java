package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
	
	WebDriver driver;
	
	@Given("User mustbe on homepage url :{string}")
	public void user_mustbe_on_homepage_url(String string) {
 // Write code here that turns the phrase above into concrete actions

		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shalini\\geckodriver.exe");

		driver=new FirefoxDriver();

		driver.get(string);
	   
	}

	@When("User Click on sign up page")
	public void user_click_on_sign_up_page() {
		 // Write code here that turns the phrase above into concrete actions

		driver.findElement(By.id("signin2")).click();

	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Signup dialog box should be open")
	public void signup_dialog_box_should_be_open() {
		 // Write code here that turns the phrase above into concrete actions

		boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-body")).isDisplayed();

		Assert.assertEquals(true,actual);

		//throw new io.cucumber.java.PendingException();
	}

}
