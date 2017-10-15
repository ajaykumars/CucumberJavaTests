/**
 * This class defines the test runner to be used for Cucumber.
 * Here we are using TestNG runner
 * The cucumber options we pass is for reporting. Initially the test results will be stored
 * in json format which will then be used by maven surefire plugin to generate html reports under
 * target/site/cucumber-reports folder.
 */

package com.ajaykumars;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:target/site/cucumber-reports", "json:target/cucumber.json" }, glue = { "com.ajaykumars" }, tags = {"@scenario"})
public class CucumberTest extends AbstractTestNGCucumberTests {

//, glue = {"com.ajaykumars.debug"}, features = {"com.ajaykumars.debug"}, tags = {"@debug"}

}