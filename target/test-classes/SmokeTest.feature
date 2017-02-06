@SmokeTest
Feature: To learn more about Selenium
  I want to create smoke tests for a demo webpage

  Scenario: Logging in as test user
    Given I open landing page
     When I log in
     Then main page is displayed
