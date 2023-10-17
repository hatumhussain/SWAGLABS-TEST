Feature: Order Functionality

  Scenario: Check the order functionality
    Given go to swaglabs page
    And User enters the username and password and click on login button
    And User is on home page
    Then Tap on cart option
    And Tap on Checkout button
    Then user enters First Name and last name and zip code
    And clicks on Continue button
    When Product description page appears
    And click on Finish button
    Then user is successfully ordered complete the order
