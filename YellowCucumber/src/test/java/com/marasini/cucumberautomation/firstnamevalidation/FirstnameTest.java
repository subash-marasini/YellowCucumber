package com.marasini.cucumberautomation.firstnamevalidation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(glue="com.marasini.cucumberautomation.firstnamevalidation", features="src/test/resources/features/firstname",
		plugin= {"pretty","html:target/htmlReport","json:target/jsonReport/json-report.json"},
		monochrome=true
		//,dryRun=true  //can provide missing implementation/corrections needed
		)
public class FirstnameTest {

}
