package com.singlife.json.runners;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/Features/PreMigration/EZsub.feature",
        glue = {"stepDefinition"},
        dryRun = false,// Path to the step definitions package
        plugin = {"pretty", "html:target/cucumber-reports"} // Cucumber reporting
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

