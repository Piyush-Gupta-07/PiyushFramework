package com.project.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features= ".", glue={"com.project.testCases"})
@CucumberOptions(features= ".",dryRun=true,tags= {"@PiyushTest1"},
monochrome=true,
plugin= {"html:Reports/HTMLReports",
		"json:Reports/JsonReports/cucumber.json",
		"junit:Reports/JUnitReport/cucumber.xml"}
		
		)


public class TestRunner {

}
