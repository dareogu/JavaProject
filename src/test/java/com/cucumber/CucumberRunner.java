package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-28 23:35
 **/
@CucumberOptions(features = "src/test/java/com/cucumber/feature/Calculator.feature")
public class CucumberRunner extends AbstractTestNGCucumberTests {


}
