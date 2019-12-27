package com.marasini.cucumberautomation.firstandlastnamevalidation;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.marasini.cucumberautomation.base.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class FirstandlastNameStepDefs extends Base {
	//runs before each scenario is executed
	@Before
	public void driverSetup() throws IOException {
		driver = initDriver();
	}
	@Given("^User is on the Facebook homepage \"([^\"]*)\"$")
    public void user_is_on_the_facebook_homepage_something(String fh) throws Throwable {
        driver.get(fh);
    }

    @When("^User enters First name \"([^\"]*)\"$")
    public void user_enters_first_name_something(String firstName) throws Throwable {
       driver.findElement(By.name("firstname")).sendKeys(firstName);
    }

    @Then("^First name is validated$")
    public void first_name_is_validated() throws Throwable {
    
      Assert.assertEquals("Subash", driver.findElement(By.name("firstname")).getAttribute("value"));
    }
    
    @When("^User enters Last name \"([^\"]*)\"$")
    public void user_enters_last_name_something(String lastName) throws Throwable {
    	driver.findElement(By.name("lastname")).sendKeys(lastName);
    }

    @Then("^Last name is validated$")
    public void last_name_is_validated() throws Throwable {
    	Assert.assertEquals("Marasini", driver.findElement(By.name("lastname")).getAttribute("value"));
    }
   //runs after each scenario is executed
    @After
    public void close_the_browser() {
      driver.close();
      driver=null;
    }

}
