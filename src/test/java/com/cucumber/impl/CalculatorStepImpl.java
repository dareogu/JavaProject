package com.cucumber.impl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * @Auther Dareo Gu
 * @Create: 2024-06-28 23:34
 **/
public class CalculatorStepImpl {

  private Calculator calculator;
  private int result;


  @Given("I have a calculator")
  public void calculator() {
    calculator = new Calculator();
  }

  @When("I add {int} and {int}")
  public void add(Integer int1, Integer int2) {
    result = calculator.add(int1, int2);
  }

  @When("I let {int} subtract {int}")
  public void subtract(Integer int1, Integer int2) {
    result = calculator.subtract(int1, int2);
  }

  @When("I let {int} multiply {int}")
  public void multiply(Integer int1, Integer int2) {
    result = calculator.multiply(int1, int2);
  }

  @When("I let {int} divide {int}")
  public void divide(Integer int1, Integer int2) {
    result = calculator.divide(int1, int2);
  }

  @Then("the result should be {int}")
  public void assertResult(Integer int1) {
    Assert.assertEquals(int1, result);
  }

  class Calculator {
    public int add(int a, int b) {
      return a + b;
    }

    public int subtract(int a, int b) {
      return a - b;
    }

    public int multiply(int a, int b) {
      return a * b;
    }

    public int divide(int a, int b) {
      return a / b;
    }

  }

}
