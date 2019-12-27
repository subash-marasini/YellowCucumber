package com.marasini.cucumberautomation.datatable;

import java.util.List;

import org.openqa.selenium.By;

import com.marasini.cucumberautomation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDatatableStepDefs extends Base{
	@Given("^User is on the Facebook homepage \"([^\"]*)\"$")
    public void user_is_on_the_facebook_homepage_something(String fh) throws Throwable {
		driver = initDriver();
        driver.get(fh);
        System.out.println("Driver initialized and ready");
    }

	    @When("^User enters anyset from the following data$")
	    public void user_enters_the_following_data(DataTable table) throws Throwable {
	    		List<List<String>> data = table.raw();
	    		String firstName = data.get(2).get(0);
	    		String lastName = data.get(2).get(1);
	    		driver.findElement(By.name("firstname")).sendKeys(firstName);
	    		driver.findElement(By.name("lastname")).sendKeys(lastName);
	    }
	    @Then("Close the browser")
	    public void close_the_browser() {
	      driver.close();
	      driver=null;
	    }
}
