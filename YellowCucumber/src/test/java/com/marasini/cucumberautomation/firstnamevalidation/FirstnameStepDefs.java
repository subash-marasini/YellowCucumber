package com.marasini.cucumberautomation.firstnamevalidation;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.marasini.cucumberautomation.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class FirstnameStepDefs extends Base {
	
	
	@Given("^User is on the Facebook homepage \"([^\"]*)\"$")
    public void user_is_on_the_facebook_homepage_something(String fh) throws Throwable {
		driver = initDriver();
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
    @Then("Close the browser")
    public void close_the_browser() {
      driver.close();
      driver=null;
    }
}
