package com.epam.selenium.training.login.runner;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.epam.selenium.training.features.login")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.epam.selenium.training")
public class LoginRunner {

//    protected static ExtentReports extent;
//    protected ExtentTest test;
//    protected ExtentTest node;
//
//    @BeforeAll
//    static void oneTimeSetup()
//    {
//        extent = new ExtentReports();
//        ExtentSparkReporter spark = new ExtentSparkReporter(
//                "target/results" + TimestampGenerator.currentTimestamp() + ".html");
//        extent.attachReporter(spark);
//    }
//
//    @AfterAll
//    static void oneTimeTearDown() throws Exception
//    {
//        extent.flush();
//    }
}
