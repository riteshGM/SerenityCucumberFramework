Feature: Google Search Functionality

  @smoketest @dev
  Scenario: User is able to search in google
    And user is on google search page
    When user enters search text
    And user hits search button
    Then user is navigated to search results page
