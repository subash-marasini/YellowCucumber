package com.marasini.cucumberautomation.firstandlastnamevalidation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags= {"@Important"},
		//tags= {"@Smoke","@Regression"}, //AND condition
		//tags= {"@Smoke,@Regression"}, //OR condition
		glue="com.marasini.cucumberautomation.firstandlastnamevalidation", features="src/test/resources/features/firstandlastname",
		plugin= {"pretty","html:target/htmlReport","json:target/jsonReport/json-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"	
		},
		monochrome=true
		//,dryRun=true  //can provide missing implementation/corrections needed
		)
public class FirstandlastNameTest {
	
}
