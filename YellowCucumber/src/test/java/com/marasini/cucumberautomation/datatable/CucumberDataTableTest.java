package com.marasini.cucumberautomation.datatable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.marasini.cucumberautomation.datatable", features = "src/test/resources/features/cucumberdatatable", plugin = {
		"pretty", "html:target/htmlReport", "json:target/jsonReport/json-report.json" }, monochrome = true
//,dryRun=true  //can provide missing implementation/corrections needed
)
public class CucumberDataTableTest {

}
