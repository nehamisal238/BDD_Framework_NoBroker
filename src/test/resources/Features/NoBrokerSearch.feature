Feature: feature to test NoBroker Search functionality

  Scenario: Validate NoBroker Search
    Given browser is open
    When user enters NoBroker url in search box
    And hits enter
    Then user is navigated to NoBroker home page
