@Trips
Feature: Search flights 
  I want to use this template for my flight search

  @OneWayTrip
  Scenario: One Way flight search
    Given I am on MakeMyTrip homepage
    When I do one way flight search for the below
    |From|Delhi|
    |To|Bangalore|
    Then I am directed to flight details
    
  @RoundWayTrip
  Scenario: Round Way flight search
    Given I am on MakeMyTrip homepage
    When I do Round way flight search for the below
    |From|Delhi|
    |To|Bangalore|
    Then I am directed to flight details
 
