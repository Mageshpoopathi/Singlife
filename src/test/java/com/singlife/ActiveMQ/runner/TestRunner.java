package com.singlife.ActiveMQ.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/PreMigration",
        glue = "com.singlife.ActiveMQ.stepDefinition",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

