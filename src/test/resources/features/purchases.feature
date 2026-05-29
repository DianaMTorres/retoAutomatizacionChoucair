Feature: Validate purchases at Swag Labs

  Scenario: buy all products
    Given that the user logs in successfully
    When they add all products
    And they enter the purchase details
    Then the successful purchase will be verified

