Feature: feature to test sign up functionality

  Scenario: check signup is successful
    Given user is on SignUp page
    When user enters the valid data
    And click on continue
    Then user signed up sucessfully
