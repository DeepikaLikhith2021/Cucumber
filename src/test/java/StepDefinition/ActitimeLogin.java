package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogin {
	WebDriver driver;
	//login to application
	@Given("User launches browser and enters Actitime URL")
	public void user_launches_browser_and_enters_actitime_url() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("loginButton")).click();
	}

	@Then("Actitime home page should be displayed")
	public void actitime_home_page_should_be_displayed() {
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.titleContains("Time-Track"));
	    driver.quit();
	}


}
