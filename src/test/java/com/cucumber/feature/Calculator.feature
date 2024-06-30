Feature: Calculator addition

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12

  Scenario: Subtract two numbers
    Given I have a calculator
    When I let 5 subtract 7
    Then the result should be -2

  Scenario: Multiply two numbers
    Given I have a calculator
    When I let 5 multiply 7
    Then the result should be 35

  Scenario: Divide two numbers
    Given I have a calculator
    When I let 35 divide 7
    Then the result should be 5