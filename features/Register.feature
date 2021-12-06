
@tag
Feature: Register to Retail Site

  @Register
  Scenario: Register to Retail Site
    Given I am on Retail Site
    When I register with my details
    Then I should be successfully registered

