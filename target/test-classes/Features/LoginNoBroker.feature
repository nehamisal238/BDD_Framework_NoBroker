Feature: to feature the login login functionality on NoBroker

  Scenario: check login is successful
    Given user is on NoBroker home page
    And clicks on log in
    When enters mobile number and Enter the password
    And click on cotinue
    Then user gets logged in Successfully
