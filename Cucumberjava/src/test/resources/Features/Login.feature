Feature: feature to test login functionality

  Scenario: Check login page for swag labs
    Given Browser is open
    And User redirectes to login page
    When user enters Username and Password
    And clicks on Login button
    Then user is successfully redirected to home page

