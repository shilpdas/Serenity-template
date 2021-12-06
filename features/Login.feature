
@tag
Feature: Login to Retail Site

  @Login
  Scenario: Login to Retail Site
    Given I am on Retail Site
    When I enter my user details
    Then I should be successfully logged in

