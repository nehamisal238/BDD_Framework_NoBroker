Feature: to feature search and rent property

  Scenario: to verify the search and rent functionality
    Given user is on main page
    And user select location and enter the landmark
    When select full house
    And click on search
    Then listed properties are visible
