#Scenario Outline Example
Feature: Test login functionality
@LoginDemo @smoke @regression @Dev @RunAll
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | standard_user   |    secret_sauce |
      | visual_user      |    secret_sauce |